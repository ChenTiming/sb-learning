package com.example.sblearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chentiming on 2018/11/25.
 */

public class ErrorController {
    @RequestMapping("/testError")
    public String error(){
        return "error";
    }
}
