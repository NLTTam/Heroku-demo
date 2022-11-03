package com.heroku.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = HelloController.ROOT_PATH)
public class HelloController {
    public static final String ROOT_PATH = "/hello";

    @GetMapping("/spring")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/world")
    public String newindex() {
        return "Hello World!";
    }

}
