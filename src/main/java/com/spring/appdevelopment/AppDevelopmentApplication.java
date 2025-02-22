package com.spring.appdevelopment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppDevelopmentApplication {

	public static final Logger logger = LoggerFactory.getLogger(AppDevelopmentApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(AppDevelopmentApplication.class, args);

		// Ensure DemoBean exists in the context
		if (context.containsBean("demoBean")) {
			logger.debug("Checking Context: {}", context.getBean("demoBean"));
		} else {
			logger.warn("DemoBean is not found in the context!");
		}

		logger.debug("\n*** Example Using @Autowire annotation on property ***");
	}
}
