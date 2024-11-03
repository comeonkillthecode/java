package org.akash.learn.spring;

import org.springframework.stereotype.Component;

public class Dev
{
    private Laptop laptop;
    private int age;

//    public Dev(int age) {
//        this.age = age;
//    }


    public Dev(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void learn(){
        System.out.println("Learning Spring Boot");
        laptop.compile();
    }
}
