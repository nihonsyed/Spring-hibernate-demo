package com.spring_hibernate_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//load configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Vehicle newCar=context.getBean("car",Car.class); 
		
		
         System.out.println(newCar.getFuelType());
	   
	   
	    context.close();
		
	   
		
	}

}
