package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	String[] fortunes = { "Happy fortune !!", "Sad fortune !!", "Crying fortune !!" };

	@Override
	public String getFortune() {

		Random random = new Random();
		return fortunes[random.nextInt(100) % 3];
	}
}
