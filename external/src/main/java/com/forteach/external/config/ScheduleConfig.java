package com.forteach.external.config;

import com.forteach.external.service.ClassesService;
import com.forteach.external.service.CourseService;
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

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0 1 * * ?")
    })
    @Async
    public void classesTasks(){
        log.info("开始执行定时任务更新班级信息 ==> {}", LocalDateTime.now());
        classesService.saveAll();
        log.info("{}　<== 执行更新班级信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0 2 * * ?")
    })
    @Async
    public void teacherTasks(){
        log.info("开始执行定时任务更新教师信息 ==> {}", LocalDateTime.now());
        teacherService.saveAllByTimestamp();
        log.info("{}　<== 执行更新教师信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0 3 * * ?")
    })
    @Async
    public void courseTasks(){
        log.info("开始执行定时任务更新课程信息 ==> {}", LocalDateTime.now());
        courseService.saveByTimestamp();
        log.info("{}　<== 执行更新课程信息定时任务结束", LocalDateTime.now());
    }

}
