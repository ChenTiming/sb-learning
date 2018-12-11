package com.example.sblearning.controller;

import com.example.sblearning.Anotation.Login;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chentiming on 2018/11/25.
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Login
    @GetMapping("loginIn")
    public void login(HttpServletRequest request, @RequestParam("username") String name){
        request.getSession().setAttribute("testInfo","true");
        request.getSession().setAttribute("token","true");

    }

    @GetMapping("loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute("testInfo");
        request.getSession().removeAttribute("token");
        return "loginOut";
    }

    @Login
    @RequestMapping("index")
    public String loginIndex(){
        return "this is login Index page";
    }
}
