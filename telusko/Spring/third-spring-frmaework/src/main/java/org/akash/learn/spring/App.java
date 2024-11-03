package org.akash.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        String[] names = context.getBeanDefinitionNames();
//        Dev obj = context.getBean(Dev.class);
//        obj.learn();
        System.out.println("In main method");
        System.out.println(Arrays.toString(names));
    }
}
