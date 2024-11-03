package org.akash.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        String[] names = context.getBeanDefinitionNames();
        System.out.println("In main method");
        System.out.println(Arrays.toString(names));

        Dev obj = (Dev) context.getBean("dev");
        System.out.println(obj.getAge());
        obj.learn();
    }
}
