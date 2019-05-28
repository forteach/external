package com.forteach.external.schedule;

import com.forteach.external.redis.service.ClassStudentService;
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
 * @date: 19-5-28 16:37
 * @version: 1.0
 * @description:
 */
@Slf4j
@Configuration
public class ClassStudentSchedule {
    @Resource
    private ClassStudentService classStudentService;

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0 0/10 * * ?"),
            @Scheduled(cron = "0 10 4 * * ?")
    })
    @Async
    public void classStudentTasks(){
        log.info("开始执行定时任务更新班级学生信息 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()){
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        classStudentService.saveUpdate();
        log.info( "{}　<== 执行更新班级学生信息定时任务结束", LocalDateTime.now());
    }
}
