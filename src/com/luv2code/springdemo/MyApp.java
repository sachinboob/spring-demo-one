package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// Create the object
		Coach theCoach_1 = new BaseballCoach();
		Coach theCoach_2 = new TrackCoach();

		// Use the object
		System.out.println(theCoach_1.getDailyWorkout());
		System.out.println(theCoach_2.getDailyWorkout());
	}

}
