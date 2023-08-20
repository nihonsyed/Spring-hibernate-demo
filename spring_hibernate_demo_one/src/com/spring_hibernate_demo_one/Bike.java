package com.spring_hibernate_demo_one;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public int getNumberOfWheels() {
		
		return 2;
	}

	@Override
	public String getFuelType() {
		return "Octen!";
	}

	@Override
	public void makeNoise() {
		System.out.println("Bhoom bhoooom!");

	}

}
