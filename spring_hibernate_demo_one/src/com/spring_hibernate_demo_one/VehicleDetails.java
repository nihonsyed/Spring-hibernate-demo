package com.spring_hibernate_demo_one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehicleDetails {
	
	
	@Autowired
	@Qualifier("car")
	private Vehicle car;
	
	@Autowired
	@Qualifier("bike")
	private Vehicle bike;
	
	public String getFuelOfCar()
	{
		return car.getFuelType();
	}
	public String getFuelOfBike()
	{
		return bike.getFuelType();
	}

}
