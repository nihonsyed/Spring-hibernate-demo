package com.spring_hibernate_demo_one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	
	@Autowired
	private Engine carEngine;
	
	@Override
	public int getNumberOfWheels() {
		return 4;
	}

	@Override
	public void makeNoise() {
		System.out.println("Beep beep!");
		
	}
	
    @Override
	public String getFuelType()
	{
		return carEngine.getFuelType();
	}

}
