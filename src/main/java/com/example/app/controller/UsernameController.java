package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsernameController {

    /**
     * Hello world endpoint.
     * @return A greeting message from Spring Boot.
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World from Spring Boot!";
    }


}
