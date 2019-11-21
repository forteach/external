package com.forteach.external.schedule;

import com.forteach.external.service.TeacherClassCourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
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
public class TeacherClassCourseSchedule {

    @Resource
    private TeacherClassCourseService teacherClassCourseService;

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
            @Scheduled(cron = "0 40 1 * * ?")
    })
    @Async
    public void saveTeacherClassCourse(){
        log.info("开始执行定时任务更新教师课程和班级对应的信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        teacherClassCourseService.saveTeacherClassAndCourseAll();
        log.info("{}　<== 执行更新教师课程和班级对应的信息定时任务结束", LocalDateTime.now());
    }

}
