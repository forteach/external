package com.forteach.external.controller;

import com.forteach.external.common.WebResult;
import com.forteach.external.service.ClassesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-1 20:20
 * @Version: 1.0
 * @Description: 班级信息
 */
@RestController
@RequestMapping("/classes")
public class ClassesController {

    @Resource
    public ClassesService classesService;

    @GetMapping("/findAll")
    public WebResult findAll(){
        return WebResult.okResult(classesService.findAllDto());
    }

    @PostMapping("/saveAll")
    public WebResult saveAll(){
        classesService.saveAll();
        return WebResult.okResult();
    }

}
