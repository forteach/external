package com.forteach.external.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.mysql.domain.Course;
import com.forteach.external.mysql.domain.CourseBuilder;
import com.forteach.external.mysql.repository.CourseRepository;
import com.forteach.external.oracle.dto.ICourseDto;
import com.forteach.external.oracle.repository.ZhxyKcxxRepository;
import com.forteach.external.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private CourseRepository courseRepository;
    @Resource
    private ZhxyKcxxRepository zhxyKcxxRepository;
    @Override
    public List<ICourseDto> findAllDto() {
        return zhxyKcxxRepository.findAllDto(ISVALIDATED_Y);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveDto() {
        List<Course> list = new ArrayList<>();
        zhxyKcxxRepository.findAllDto(ISVALIDATED_Y)
                .parallelStream()
                .filter(iCourseDto -> StrUtil.isNotBlank(iCourseDto.getCourseId()))
                .forEach(iCourseDto -> {
                    list.add(Course.builder()
                            .courseId(StrUtil.isNotBlank(iCourseDto.getCourseId()) ? iCourseDto.getCourseId() : IdUtil.fastSimpleUUID())
                            .courseName(iCourseDto.getCourseName())
                            .courseDescribe(iCourseDto.getCourseDescribe())
                            .build());
                });
        courseRepository.saveAll(list);
    }

    @Override
    public void saveByTimestamp() {
        List<Course> list = new ArrayList<>();
        zhxyKcxxRepository.findAllDtoByTimestamp(DateUtil.offsetDay(new Date(), -2).toDateStr())
                .parallelStream()
                .filter(iCourseDto -> StrUtil.isNotBlank(iCourseDto.getCourseId()))
                .forEach(iCourseDto -> {
                    list.add(CourseBuilder.aCourse()
                            .withCourseId(StrUtil.isNotBlank(iCourseDto.getCourseId()) ? iCourseDto.getCourseId() : IdUtil.fastSimpleUUID())
                            .withCourseName(iCourseDto.getCourseName())
                            .withCourseDescribe(iCourseDto.getCourseDescribe())
                            .withIsValidated(ISVALIDATED_Y.equals(iCourseDto.getIsValidated()) ? ISVALIDATED_0 : ISVALIDATED_1)
                            .build());
                });
        courseRepository.saveAll(list);
    }


}
