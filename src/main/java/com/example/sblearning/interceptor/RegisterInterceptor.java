package com.example.sblearning.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by chentiming on 2018/11/25.
 */
@Configuration
public class RegisterInterceptor extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor());
        super.addInterceptors(registry);
    }
}
