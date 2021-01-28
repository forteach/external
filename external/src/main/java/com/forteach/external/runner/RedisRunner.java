package com.forteach.external.runner;

import com.forteach.external.redis.service.ClassStudentService;
import com.forteach.external.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
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
    private final ClassesService classesService;

    private final PlanCourseService planCourseService;

    private RedisRunner(StudentService studentService, TeacherService teacherService,
                        TeacherClassCourseService teacherClassCourseService, ClassesService classesService,
                        CourseService courseService, ClassStudentService classStudentService, PlanCourseService planCourseService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.teacherClassCourseService = teacherClassCourseService;
        this.courseService = courseService;
        this.classStudentService = classStudentService;
        this.classesService = classesService;
        this.planCourseService = planCourseService;
    }

    /**
     * 保存用户信息到 redis
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        studentService.saveAll();
        teacherService.saveAll();
        teacherClassCourseService.saveTeacherClassAndCourseAll();
        courseService.saveDto();
        classStudentService.saveUpdate();
        classesService.saveAll();
        //同步课程表数据
        planCourseService.saveAll();
        if (log.isInfoEnabled()) {
            log.info("Thread name : {}, save students redis OK!", Thread.currentThread().getName());
        }
    }
}
