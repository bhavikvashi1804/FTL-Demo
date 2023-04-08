package com.bhavik.students;

import com.bhavik.students.controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {

	@Autowired
	HomeController homeController;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		String name = homeController.getStudentName();
//		System.out.println(name);
//
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(HomeController.class);
//		System.out.println(appContext.getBean("getStudentName"));
//		System.out.println(appContext.getBean(String.class));
	}
}
