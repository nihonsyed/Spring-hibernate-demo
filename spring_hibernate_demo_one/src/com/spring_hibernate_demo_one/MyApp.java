package com.spring_hibernate_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//load configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		VehicleDetails vehicleDetails1=context.getBean("vehicleDetails",VehicleDetails.class);
		
		VehicleDetails vehicleDetails2=context.getBean("vehicleDetails",VehicleDetails.class);
		
		System.out.println(vehicleDetails1==vehicleDetails2);
	   
	   
	    context.close();
		
	   
		
	}

}
