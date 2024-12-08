package com.akash.learning.first_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Greet {

    @RequestMapping("/")
    public String greet(){
        return "Hi, I am Akash.";
    }
}
