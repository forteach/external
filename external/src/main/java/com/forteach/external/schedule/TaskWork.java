package com.forteach.external.schedule;

import com.forteach.external.redis.service.ClassStudentService;
import com.forteach.external.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-11-27 17:40
 * @version: 1.0
 * @description:
 */
@Slf4j
@Configuration
public class TaskWork {
    @Resource
    private TeacherService teacherService;

    @Resource
    private TeacherClassCourseService teacherClassCourseService;

    @Resource
    private StudentService studentService;

    @Resource
    private CourseService courseService;

    @Resource
    private CourseJoinChapterService courseJoinChapterService;

    @Resource
    private ClassStudentService classStudentService;

    @Resource
    public ClassesService classesService;

    @Resource
    private PlanCourseService planCourseService;

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 0 1 * * ?")
    })
    @Async
    public void classesTasks() {
        log.info("开始执行定时任务更新班级信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        classesService.saveAll();
        log.info("{}　<== 执行更新班级信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 10 1 * * ?")
    })
    @Async
    public void teacherTasks() {
        log.info("开始执行定时任务更新教师信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        teacherService.saveAllByTimestamp();
        log.info("{}　<== 执行更新教师信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 20 1 * * ?")
    })
    @Async
    public void courseTasks() {
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
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 30 1 * * ?")
    })
    @Async
    public void studentTasks() {
        log.info("开始执行定时任务更新学生信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        //执行更新数据
        studentService.updateTimestamp();
        log.info("{}　<== 执行更新学生信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 40 1 * * ?")
    })
    @Async
    public void saveTeacherClassCourse() {
        log.info("开始执行定时任务更新教师课程和班级对应的信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        teacherClassCourseService.saveTeacherClassAndCourseAll();
        log.info("{}　<== 执行更新教师课程和班级对应的信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 10 4 * * ?")
    })
    @Async
    public void classStudentTasks() {
        log.info("开始执行定时任务更新班级学生信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        classStudentService.saveUpdate();
        log.info("{}　<== 执行更新班级学生信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 0/20 * * * ?")
    })
    @Async
    public void saveOrUpdateJoinCourse() {
        log.info("开始执行定时任务加入课程章节信息开始 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        courseJoinChapterService.saveJoinCourseChapter();
        log.info("{}　<== 执行更新加入课程章节信息定时任务结束", LocalDateTime.now());
    }

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/30 * * * ?")
            @Scheduled(cron = "0 30 4 * * ?")
    })
    @Async
    public void updatePlanCourse() {
        log.info("开始执行定时任务同步课程表 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        planCourseService.saveAll();
        log.info("{}　<== 执行更新同步课程表定时任务结束", LocalDateTime.now());
    }
}