package com.example.sblearning.interceptor;

import com.example.sblearning.Anotation.Login;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by chentiming on 2018/11/25.
 */
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod method = (HandlerMethod ) handler;
        Class<?> controllerType = method.getBeanType();

        if(method.getMethodAnnotation(Login.class) != null || controllerType.getAnnotation(Login.class) != null){
            return true;
        }

        HttpSession session = request.getSession();
        String token = (String)session.getAttribute("token");
        if(!StringUtils.isEmpty(token)){
            return true;
        }

        response.sendRedirect("/login/index");
        return false;
    }
}
