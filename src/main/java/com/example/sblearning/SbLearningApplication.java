package com.example.sblearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.sblearning.dal")
@ComponentScan(basePackages={
		"com.example.sblearning.service",
		"com.example.sblearning.dal",
		"com.example.sblearning.controller"})
@SpringBootApplication
public class SbLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbLearningApplication.class, args);
	}
}
