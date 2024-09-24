package com.demo;

import java.util.Stack;

public class ReverseString {
	public static String reverse(String str) {
		//type should be character
		Stack <Character> stack = new Stack<>();
		char[] chas = str.toCharArray();
		
		//to iterate through string
		for(char c : chas) {
			//to store character c in stack use push
			stack.push(c);
		}
		
		//iterate through characters
		for(int i = 0; i < str.length(); i++) {
			//pop and save in array
			chas[i] = stack.pop();
		}
		//new string to store reverse string
		return new String(chas);
	}

	public static void main(String[] args) {
		
		String str = "hello string";
		System.out.println("Before reverse : " + str);
		//to print reverse call simply reverse method
		System.out.println("After reverse : " + reverse(str));
		
	}

}
