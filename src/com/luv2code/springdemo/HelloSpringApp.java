package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from Spring container
		Coach theCoach1 = context.getBean("myTrackCoach", Coach.class);
		Coach theCoach2 = context.getBean("myBaseballCoach", Coach.class);

		// call methods on bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());

		// close the context
		context.close();

	}

}
