package com.spring_hibernate_demo_one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach {
	
	
  @Value("${baseball.coach.name}")
  private String nameOfTheCoach;
  
  @Value("${coaching.year}")
  private int coachingYear;
  
  
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
  public int getCoachingYear()
  {
	  return coachingYear;
  }
  
}
