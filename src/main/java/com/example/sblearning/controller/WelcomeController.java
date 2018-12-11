package com.example.sblearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chentiming on 2018/11/22.
 */
@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @RequestMapping("hello")
    public String welcome(){
        return "hello";
    }
}
