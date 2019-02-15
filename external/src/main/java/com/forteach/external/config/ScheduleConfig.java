package com.forteach.external.config;

import com.forteach.external.service.ClassesService;
import com.forteach.external.service.CourseService;
import com.forteach.external.service.StudentService;
import com.forteach.external.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-3 11:33
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Resource
    public ClassesService classesService;

    @Resource
    private CourseService courseService;

    @Resource
    private TeacherService teacherService;

    @Resource
    private StudentService studentService;

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0 1 * * ?")
    })
    @Async
    public void classesTasks(){
        log.info("开始执行定时任务更新班级信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()){
           log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        classesService.saveAll();
        log.info( "{}　<== 执行更新班级信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 10 1 * * ?")
    })
    @Async
    public void teacherTasks(){
        log.info("开始执行定时任务更新教师信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        teacherService.saveAllByTimestamp();
        log.info("{}　<== 执行更新教师信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 20 1 * * ?")
    })
    @Async
    public void courseTasks(){
        log.info("开始执行定时任务更新课程信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        //保存到mysql
        courseService.saveByTimestamp();
        //保存到redis
        courseService.saveRedis();
        log.info("{}　<== 执行更新课程信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/2 * * * ?"),
            @Scheduled(cron = "0 30 1 * * ?")
    })
    @Async
    public void studentTasks(){
        log.info("开始执行定时任务更新学生信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        //执行更新数据
        studentService.updateTimestamp();
        log.info("{}　<== 执行更新学生信息定时任务结束", LocalDateTime.now());
    }

}
