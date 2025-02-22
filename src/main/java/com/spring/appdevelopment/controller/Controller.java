package com.spring.appdevelopment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("INFO: Hello endpoint called.");
        logger.debug("DEBUG: Returning Hello message.");
        return "Hello, Spring Boot Logging!";
    }
}
