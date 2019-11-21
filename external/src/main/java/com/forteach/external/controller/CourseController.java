//package com.forteach.external.controller;
//
//import com.forteach.external.common.WebResult;
//import com.forteach.external.config.WebMvcConfig;
//import com.forteach.external.service.CourseService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * @Auther: zhangyy
// * @Email: zhang10092009@hotmail.com
// * @Date: 19-1-1 20:23
// * @Version: 1.0
// * @Description:　课程信息
// */
//@RestController
//@RequestMapping("/course")
//public class CourseController {
//
//    @Resource
//    private CourseService courseService;
//
//    @GetMapping("/findAll")
//    public WebResult findAll(){
//        return WebResult.okResult(courseService.findAllDto());
//    }
//
//    @PostMapping("/saveAll")
//    public WebResult saveAll(){
//        courseService.saveDto();
//        return WebResult.okResult();
//    }
//
//    @PostMapping("/saveAllTimestamp")
//    public WebResult saveAllTimestamp(){
//        courseService.saveByTimestamp();
//        return WebResult.okResult();
//    }
//}
