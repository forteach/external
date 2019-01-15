package com.forteach.external.service.impl;

import com.forteach.external.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 11:17
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;

    @Test
    public void save() {
        studentService.saveAll();
    }
}