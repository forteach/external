package com.forteach.external.runner;

import com.forteach.external.service.StudentService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 17:26
 * @Version: 1.0
 * @Description:
 */
@Component
@Order(value = 1)
public class RedisRunner implements ApplicationRunner {
    @Resource
    private StudentService studentService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        studentService.saveAll();
    }
}
