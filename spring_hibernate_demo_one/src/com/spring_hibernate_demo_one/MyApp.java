package com.spring_hibernate_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//load configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballCoach coach=context.getBean("myCoach",BaseballCoach.class);
		
	   System.out.println(coach.getBaseballCoachName()+" is the coach of liverpool");
	   
	   
	   
	   context.close();
		
	   
		
	}

}