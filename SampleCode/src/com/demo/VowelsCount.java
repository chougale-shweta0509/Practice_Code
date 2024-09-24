package com.demo;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		
		int count = 0;
		for(char c : ch) {
			
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count++;
				break;
			}
		}
		System.out.println("print count= "+count);
	}

}
