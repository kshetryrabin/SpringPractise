package com.rabin.springdemo;

public class BaseballCoach implements Coach  {
	//private field for dependency interface
	public FortuneService fortuneService;
	//constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	public String getDailyWorkout(){
		return"spend 30 minutes ";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
