package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Step1-
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// Step2-
		Student student = (Student) applicationContext.getBean("s");

		// Step3-
		System.out.println("Student Data>> " + student);

	}

}
