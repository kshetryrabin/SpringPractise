package com.rabin.springdemo;

import org.springframework.stereotype.Component;

@Component("thatstupidCoach")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise penalty shoots today";
	}

}
