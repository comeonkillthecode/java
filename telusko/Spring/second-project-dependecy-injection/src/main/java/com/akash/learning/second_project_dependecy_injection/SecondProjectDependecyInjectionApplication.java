package com.akash.learning.second_project_dependecy_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondProjectDependecyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SecondProjectDependecyInjectionApplication.class, args);

		Dev dev = context.getBean(Dev.class);

		dev.learn();
	}

}
