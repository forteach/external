package com.forteach.external.service.impl;

import com.forteach.external.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

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
    private CourseService courseService;
    @Test
    public void saveRedis() {
        courseService.saveRedis();
    }
}