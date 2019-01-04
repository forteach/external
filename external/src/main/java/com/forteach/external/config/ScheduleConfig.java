package com.forteach.external.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
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

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0 1 * * ?")
    })
    @Async
    public void configureTasks(){
        log.info("开始执行定时任务 ==> {}", LocalDateTime.now());

        log.info("{}　<== 执行定时任务结束", LocalDateTime.now());
    }

}
