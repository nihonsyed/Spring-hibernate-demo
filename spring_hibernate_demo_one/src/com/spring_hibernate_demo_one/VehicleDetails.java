package com.spring_hibernate_demo_one;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/*Spring calls the methods annotated with @PostConstruct only once, just after the initialization of bean properties. Keep in mind that these methods will run even if there's nothing to initialize.

   The method annotated with @PostConstruct can have any access level, but it can't be static.
 * 
 * 
 * A method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context.
 * 
 * Same as with @PostConstruct, the methods annotated with @PreDestroy can have any access level, but can't be static.
 * 
 * The @PreDestroy annotation is typically used for singletons, and its behavior might be unpredictable when used with prototype-scoped beans. This is because prototype-scoped beans are not managed by the Spring container after they are created and returned to the client.
 * 
 * */

@Component
public class VehicleDetails {
	
	
	@Autowired
	@Qualifier("car")
	private Vehicle car;
	
	
    @PostConstruct
    private void intit()
    {
    	System.out.println("intit() invoked after the bean constructed");
    }
    
    @PreDestroy
    private void end()
    {
    	System.out.println("end() invoked before the bean getting destructed");
    }
	
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
