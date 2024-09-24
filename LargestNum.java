package com.demo.array;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//int num1 = 7, num2 = 9, num3 = 10;
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is largest num");
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is larest num");
		}else {
			System.out.println(num3 +" is largest num");
		}
	}

}
