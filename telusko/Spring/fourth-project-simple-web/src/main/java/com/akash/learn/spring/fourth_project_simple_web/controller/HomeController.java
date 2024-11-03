package com.akash.learn.spring.fourth_project_simple_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Akash's learnings";
    }

    @RequestMapping("/about")
    public String about(){
        return "Am still learning";
    }
}
