package com.rabin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}

}
