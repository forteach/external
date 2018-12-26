package com.forteach.external.controller;

import com.forteach.external.common.WebResult;
import com.forteach.external.repository.TSUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-26 11:32
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class TSUserController {
    private final TSUserRepository tsUserRepository;

    @Autowired
    public TSUserController(TSUserRepository tsUserRepository) {
        this.tsUserRepository = tsUserRepository;
    }

    @GetMapping("/findAllUsers")
    public WebResult findAll(){
        return WebResult.okResult(tsUserRepository.findAllUserDto());
    }

}
