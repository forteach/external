package com.forteach.external.schedule;

import com.forteach.external.service.CourseJoinChapterService;
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
 * @date: 19-5-6 16:35
 * @version: 1.0
 * @description:
 */
@Slf4j
@Configuration
public class CourseJoinChapterIdSchedule {

    @Resource
    private CourseJoinChapterService courseJoinChapterService;

    @Schedules({
            // TODO 注释每分钟执行任务
//            @Scheduled(cron = "0 0/1 * * * ?"),
            @Scheduled(cron = "0 0/20 * * * ?")
    })
    @Async
    public void saveOrUpdate(){
        log.info("开始执行定时任务加入课程章节信息开始 ==> {}", LocalDateTime.now());
        if (log.isDebugEnabled()) {
            log.debug("执行线程 : {}", Thread.currentThread().getName());
        }
        courseJoinChapterService.saveJoinCourseChapter();
        log.info("{}　<== 执行更新加入课程章节信息定时任务结束", LocalDateTime.now());
    }
}
