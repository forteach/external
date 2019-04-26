package com.forteach.external.service.impl;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.mongodb.domain.ClassesInfo;
import com.forteach.external.mysql.domain.Classes;
import com.forteach.external.mysql.repository.ClassesRepository;
import com.forteach.external.oracle.dto.IClassesDto;
import com.forteach.external.oracle.dto.ICourseDto;
import com.forteach.external.oracle.repository.GzBjxxbRepository;
import com.forteach.external.service.ClassesService;
import jdk.internal.instrumentation.ClassInstrumentation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import static com.forteach.external.common.Dic.COURSE_PREFIX;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:12
 * @Version: 1.0
 * @Description:
 */
@Service
@Slf4j
public class ClassesServerImpl implements ClassesService {
    @Resource
    private GzBjxxbRepository gzBjxxbRepository;
    @Resource
    private ClassesRepository classesRepository;
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private HashOperations<String, String, Object> hashOperations;
    @Override
    public List<IClassesDto> findAllDto() {
        return gzBjxxbRepository.findAllDto();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveAll() {
        List<Classes> list = new ArrayList<>();
        List<ClassesInfo> classesInfos = new ArrayList<>();
        gzBjxxbRepository.findAllDto()
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(iClassesDto -> StrUtil.isNotBlank(iClassesDto.getClassId()) && StrUtil.isNotBlank(iClassesDto.getClassName()))
                .forEach(iClassesDto -> {
                    list.add(Classes.builder()
                            .classId(iClassesDto.getClassId())
                            .className(iClassesDto.getClassName())
                            .grade(iClassesDto.getGrade())
                            .build());
                    classesInfos.add(ClassesInfo.builder()
                            .classId(iClassesDto.getClassId())
                            .className(iClassesDto.getClassName())
                            .grade(iClassesDto.getGrade())
                            .build());
                });
        //保存mysql
        classesRepository.saveAll(list);
        //保存mongodb
        mongoTemplate.insertAll(classesInfos);
    }

//    /**
//     * 保存到redis数据库
//     * @param iClassesDto
//     */
//    private void addRedis(IClassesDto iClassesDto){
//        HashMap<String, Object> map = MapUtil.newHashMap();
//        map.put("classId", iClassesDto.getClassId());
//        map.put("className", iClassesDto.getClassName());
//        map.put("grade", iClassesDto.getGrade());
//        hashOperations.putAll(COURSE_PREFIX.concat(iClassesDto.getClassId()), map);
//    }
}
