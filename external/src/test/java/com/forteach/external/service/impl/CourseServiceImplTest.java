package com.forteach.external.service.impl;

import com.forteach.external.mysql.domain.CourseEntitys;
import com.forteach.external.mysql.repository.CourseEntitysRepository;
import com.forteach.external.mysql.repository.CourseRepository;
import com.forteach.external.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Objects;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-1-17 10:44
 * @version: 1.0
 * @description:
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class CourseServiceImplTest {

    @Resource
    private CourseRepository courseRepository;
    @Resource
    private CourseEntitysRepository courseEntitysRepository;
    @Resource
    private CourseService courseService;

    @Test
    public void saveRedis() {
        courseService.saveRedis();
    }

    @Test
    public void saveCourses() {
        courseRepository.findAll()
                .parallelStream()
                .filter(Objects::nonNull)
                .forEach(course -> {
                    CourseEntitys courseEntitys = new CourseEntitys();
                    courseEntitys.setCourseId(course.getCourseId());
                    courseEntitys.setCourseName(course.getCourseName());
                    courseEntitys.setCourseDescribe(course.getCourseDescribe());
                    courseEntitysRepository.save(courseEntitys);
                });
    }
}