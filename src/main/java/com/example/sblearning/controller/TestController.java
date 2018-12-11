package com.example.sblearning.controller;

import com.example.sblearning.Anotation.Login;
import com.example.sblearning.dal.entity.User;
import com.example.sblearning.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chentiming on 2018/11/25.
 */
@RestController
@RequestMapping("test")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @Login
    @GetMapping("testInfo")
    public void testInfo(HttpServletRequest request){
        User user = userService.getUserByName("chentm");
        logger.info("log:" +user.getPassword());
        System.out.println(user.getPassword());

    }

    @RequestMapping("testTemp")
    public void testTemp(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

    }
}
