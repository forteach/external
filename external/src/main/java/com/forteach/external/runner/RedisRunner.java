package com.forteach.external.runner;

import com.forteach.external.service.StudentService;
import com.forteach.external.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
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
@Order(value = 100)
@Slf4j
public class RedisRunner implements ApplicationRunner {

    private final StudentService studentService;

    private final TeacherService teacherService;

    private RedisRunner(StudentService studentService, TeacherService teacherService){
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    /**
     * 保存用户信息到 redis
     * @param args
     * @throws Exception
     */
    @Async
    @Override
    public void run(ApplicationArguments args) throws Exception {
        studentService.saveAll();
        teacherService.saveAll();
        if(log.isInfoEnabled()) {
            log.info("Thread name : {}, save students redis OK!", Thread.currentThread().getName());
        }
    }
}
