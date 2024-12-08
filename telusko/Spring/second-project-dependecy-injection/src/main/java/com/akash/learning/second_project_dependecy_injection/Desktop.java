package com.akash.learning.second_project_dependecy_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling in desktop");
    }
}
