package com.forteach.external.controller;

import com.forteach.external.common.WebResult;
import com.forteach.external.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-1 20:25
 * @Version: 1.0
 * @Description:　教师信息
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @GetMapping("/findAllDto")
    public WebResult findAllDto(){
        return WebResult.okResult(teacherService.findAllDto());
    }

    @PostMapping("/saveAll")
    public WebResult saveAll(){
        teacherService.saveAll();
        return WebResult.okResult();
    }

    @PostMapping("/saveAllByTimestamp")
    public WebResult saveAllByTimestamp(){
        teacherService.saveAllByTimestamp();
        return WebResult.okResult();
    }
}
