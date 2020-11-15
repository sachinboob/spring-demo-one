package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach :- Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach :- " + this.fortuneService.getFortune();
	}

}
