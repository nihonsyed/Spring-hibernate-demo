package com.spring_hibernate_demo_one;

public class BaseballCoach {
	
  private String nameOfTheCoach;
  
  
  public void init()
  {
	  System.out.println("bean initiated!");
  }
  
  public void end()
  {
	  System.out.println("end of the bean");
  }
  
  
  
  public void setNameOfTheCoach(String nameOfTheCoach)
  {
	  this.nameOfTheCoach=nameOfTheCoach;
  }
  
  public String getBaseballCoachName()
  {
	  return nameOfTheCoach;
  }
  
  
}
