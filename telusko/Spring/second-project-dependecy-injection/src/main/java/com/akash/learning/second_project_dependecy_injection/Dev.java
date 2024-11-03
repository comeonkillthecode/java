package com.akash.learning.second_project_dependecy_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field Injection
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

//    constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void learn(){
        comp.compile();
        System.out.println("Learning Spring Boot");
    }
}
