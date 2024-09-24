package com.demo.array;

import java.util.Scanner;

public class CountInterger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		//int num = sc.nextInt();
		long num = sc.nextLong();
		int count = 0;
		while(num != 0) {
			num = num / 10;
			count ++;
		}
		System.out.println("number of digit " + count);
		
//		String result = Integer.toString(num);
//		System.out.println(result.length());
	}

}
