package com.forteach.external.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.mongodb.domain.CourseInfo;
import com.forteach.external.mysql.domain.CourseEntitys;
import com.forteach.external.mysql.domain.builder.CourseBuilder;
import com.forteach.external.mysql.repository.CourseRepository;
import com.forteach.external.oracle.dto.ICourseDto;
import com.forteach.external.oracle.repository.ZhxyKcxxRepository;
import com.forteach.external.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static com.forteach.external.common.Dic.*;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:37
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private HashOperations<String, String, String> hashOperations;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private CourseRepository courseRepository;

    @Resource
    private ZhxyKcxxRepository zhxyKcxxRepository;

    @Resource
    private MongoTemplate mongoTemplate;

//    @Override
//    public List<ICourseDto> findAllDto() {
//        return zhxyKcxxRepository.findAllDto(ISVALIDATED_Y);
//    }

    @Override
    @Async
    public void saveDto() {
        this.saveAll(zhxyKcxxRepository.findAllDto(ISVALIDATED_Y));
    }

    /**
     * 执行定时任务需要保存的最近三天修改的信息
     * 课程信息
     */
    @Override
    @Async
    public void saveByTimestamp() {
        this.saveAll(zhxyKcxxRepository.findAllDtoByTimestamp(DateUtil.offsetDay(new Date(), -3).toDateStr()));
    }

    private void saveAll(List<ICourseDto> iCourseDtos) {
        List<CourseEntitys> list = new ArrayList<>();
        List<CourseInfo> courseInfoList = new ArrayList<>();
        iCourseDtos.parallelStream()
                .filter(Objects::nonNull)
                .filter(iCourseDto -> StrUtil.isNotBlank(iCourseDto.getCourseId()) &&
                        StrUtil.isNotBlank(iCourseDto.getCourseName()))
                .forEach(iCourseDto -> {
                    //mysql
                    list.add(CourseBuilder.aCourse()
                            .withCourseId(iCourseDto.getCourseId())
                            .withCourseName(iCourseDto.getCourseName())
                            .withCourseDescribe(iCourseDto.getCourseDescribe() == null ? "" : iCourseDto.getCourseDescribe())
                            .withIsValidated(ISVALIDATED_Y.equals(iCourseDto.getIsValidated()) ? ISVALIDATED_0 : ISVALIDATED_1)
                            .build());
                    //mongodb
                    courseInfoList.add(CourseInfo.builder()
                            .courseDescribe(iCourseDto.getCourseDescribe())
                            .courseId(iCourseDto.getCourseId())
                            .courseName(iCourseDto.getCourseName())
                            .build());
                });

        //mysql
        if (!list.isEmpty()) {
            courseRepository.saveAll(list);
        }

        //mongodb
        if (!courseInfoList.isEmpty()) {

            mongoTemplate.dropCollection(CourseInfo.class);

            mongoTemplate.insertAll(courseInfoList);
        }
    }

    @Override
    public void saveRedis() {
        zhxyKcxxRepository.findAllDto(ISVALIDATED_Y)
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(iCourseDto -> StrUtil.isNotBlank(iCourseDto.getCourseId())
                        && StrUtil.isNotBlank(iCourseDto.getCourseName()))
                .forEach(this::addRedis);
    }

    /**
     * 保存到redis数据库
     *
     * @param iCourseDto
     */
    private void addRedis(ICourseDto iCourseDto) {
        HashMap<String, String> map = MapUtil.newHashMap();
        map.put("courseId", iCourseDto.getCourseId());
        map.put("courseName", iCourseDto.getCourseName());
        map.put("courseDescribe", iCourseDto.getCourseDescribe());
        String key = getKey(iCourseDto.getCourseId());
        hashOperations.putAll(key, map);
        redisTemplate.expire(key, 365, TimeUnit.DAYS);
    }


    private String getKey(String courseId) {
        return COURSE_PREFIX.concat(courseId);
    }
}