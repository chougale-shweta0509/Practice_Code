package com.demo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {

		double n = Math.random();
		System.out.println(n);
		
		System.out.println(ThreadLocalRandom.current().nextInt());
	}

}
