package com.spring.appdevelopment;

import com.spring.appdevelopment.bean.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppDevelopmentApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(AppDevelopmentApplication.class, args);
		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}
}
