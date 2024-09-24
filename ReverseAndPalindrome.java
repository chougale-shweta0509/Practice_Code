package com.demo.array;

public class ReverseAndPalindrome {

	public static void main(String[] args) {
		int num = 12321;
		int rem, temp, reverse = 0;
		
		temp = num;
		while(num != 0) {
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}
		System.out.println("reverse : "+ reverse);
		if( reverse == temp) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
