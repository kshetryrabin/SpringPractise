package com.rabin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("thatstupidCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}

}
