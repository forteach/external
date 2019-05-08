package com.forteach.external.schedule;

import com.forteach.external.service.JoinClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-29 12:08
 * @version: 1.0
 * @description:
 */
@Slf4j
@Configuration
public class JoinClassSchedule {

    @Resource
    private JoinClassService joinClassService;

    // 每隔2个小时运行一次
    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0 0/2 * * ?")
    })
    private void saveJoinClassStudents(){
        log.info("开始执行定时任务修改加入课堂的学生信息上课位置 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        joinClassService.saveJoinClassInfo();
    }
}
