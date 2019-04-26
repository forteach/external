package com.forteach.external.service.impl;

import com.forteach.external.mongodb.domain.ClassTeacherCourse;
import com.forteach.external.mysql.domain.TeacherAndClassAndCourse;
import com.forteach.external.mysql.repository.TeacherClassCourseRepository;
import com.forteach.external.oracle.repository.ZhxyKcxxPkxxRepository;
import com.forteach.external.service.TeacherClassCourseService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 15:09
 * @version: 1.0
 * @description:
 */
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
        List<TeacherAndClassAndCourse> list = new ArrayList<>();
        List<ClassTeacherCourse> courseList = new ArrayList<>();
        zhxyKcxxPkxxRepository.findByClassIdAndCourse()
                .parallelStream()
                .forEach(teacherClassCourseDto -> {
                    //mysql
                    list.add(TeacherAndClassAndCourse.builder()
                            .classId(teacherClassCourseDto.getClassId())
                            .courseId(teacherClassCourseDto.getCourseId())
                            .teacherId(teacherClassCourseDto.getTeacherId())
                            .build());

                    //mongodb
                    courseList.add(ClassTeacherCourse.builder()
                            .classId(teacherClassCourseDto.getClassId())
                            .courseId(teacherClassCourseDto.getCourseId())
                            .teacherId(teacherClassCourseDto.getTeacherId())
                            .build());
                });
        //保存mysql
        teacherClassCourseRepository.saveAll(list);
        //保存mongodb
        mongoTemplate.insertAll(courseList);
    }
}
