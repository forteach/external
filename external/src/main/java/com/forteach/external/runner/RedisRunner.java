package com.forteach.external.runner;

import com.forteach.external.redis.service.ClassStudentService;
import com.forteach.external.service.CourseService;
import com.forteach.external.service.StudentService;
import com.forteach.external.service.TeacherClassCourseService;
import com.forteach.external.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 17:26
 * @Version: 1.0
 * @Description: 启动后就执行的方法, @Order 执行顺序
 */
@Component
@Order(value = 100)
@Slf4j
public class RedisRunner implements ApplicationRunner {

    private final StudentService studentService;
    private final CourseService courseService;
    private final TeacherService teacherService;
    private final TeacherClassCourseService teacherClassCourseService;
    private final ClassStudentService classStudentService;

    private RedisRunner(StudentService studentService, TeacherService teacherService, TeacherClassCourseService teacherClassCourseService, CourseService courseService, ClassStudentService classStudentService){
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.teacherClassCourseService = teacherClassCourseService;
        this.courseService = courseService;
        this.classStudentService = classStudentService;
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
        teacherClassCourseService.saveTeacherClassAndCourseAll();
        courseService.saveDto();
        classStudentService.saveUpdate();
        if(log.isInfoEnabled()) {
            log.info("Thread name : {}, save students redis OK!", Thread.currentThread().getName());
        }
    }
}
