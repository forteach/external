package com.forteach.external.schedule;

import com.forteach.external.service.TeacherService;
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
 * @date: 19-4-29 12:07
 * @version: 1.0
 * @description:
 */
@Slf4j
@Configuration
public class TeacherSchedule {

    @Resource
    private TeacherService teacherService;

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?")
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
}
