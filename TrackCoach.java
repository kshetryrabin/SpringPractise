package com.rabin.springdemo;

public class TrackCoach implements Coach {
	public FortuneService fortuneService;
	//for running MyApp
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
