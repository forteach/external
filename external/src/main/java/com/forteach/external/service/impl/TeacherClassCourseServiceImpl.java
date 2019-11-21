package com.forteach.external.service.impl;

import cn.hutool.core.util.StrUtil;
import com.forteach.external.mongodb.domain.ClassTeacherCourse;
import com.forteach.external.mysql.domain.TeacherClassCourse;
import com.forteach.external.mysql.repository.TeacherClassCourseRepository;
import com.forteach.external.oracle.repository.ZhxyKcxxPkxxRepository;
import com.forteach.external.service.TeacherClassCourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 15:09
 * @version: 1.0
 * @description:
 */
@Slf4j
@Service
public class TeacherClassCourseServiceImpl implements TeacherClassCourseService {

    private final TeacherClassCourseRepository teacherClassCourseRepository;
    private final ZhxyKcxxPkxxRepository zhxyKcxxPkxxRepository;
    private final MongoTemplate mongoTemplate;
    public TeacherClassCourseServiceImpl(TeacherClassCourseRepository teacherClassCourseRepository,
                                         ZhxyKcxxPkxxRepository zhxyKcxxPkxxRepository,
                                         MongoTemplate mongoTemplate){
        this.teacherClassCourseRepository = teacherClassCourseRepository;
        this.zhxyKcxxPkxxRepository = zhxyKcxxPkxxRepository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void saveTeacherClassAndCourseAll(){
        List<TeacherClassCourse> list = new ArrayList<>();
        List<ClassTeacherCourse> courseList = new ArrayList<>();
        zhxyKcxxPkxxRepository.findCourse()
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(iTeacherClassCourseDto ->
                        StrUtil.isNotBlank(iTeacherClassCourseDto.getClassId())
                        && StrUtil.isNotBlank(iTeacherClassCourseDto.getCourseId())
                        && StrUtil.isNotBlank(iTeacherClassCourseDto.getTeacherId()))
                .forEach(iTeacherClassCourseDto -> {
                    //mysql
                    //mongodb
                    courseList.add(ClassTeacherCourse.builder()
                            .classId(iTeacherClassCourseDto.getClassId())
                            .courseId(iTeacherClassCourseDto.getCourseId())
                            .teacherId(iTeacherClassCourseDto.getTeacherId())
                            .build());
                    teacherClassCourseRepository.save(TeacherClassCourse.builder()
                            .classId(iTeacherClassCourseDto.getClassId())
                            .courseId(iTeacherClassCourseDto.getCourseId())
                            .teacherId(iTeacherClassCourseDto.getTeacherId())
                            .build());
                });
        //保存mysql
//        if (list.size() > 0) {
//            teacherClassCourseRepository.saveAll(list);
//        }
        //保存mongodb
        if (!courseList.isEmpty()) {
            mongoTemplate.dropCollection(ClassTeacherCourse.class);
            mongoTemplate.insertAll(courseList);
        }
    }
}
