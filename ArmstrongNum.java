package com.demo.array;

public class ArmstrongNum {

	public static void main(String[] args) {
		int sum = 0, rem, temp;
		int num = 153;//check whether it is armstrong
		
		temp = num;
		
		while(num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + (rem * rem * rem);
		}
		if(temp == sum) {
			System.out.println("ArmStrong");
		}else {
			System.out.println("not armstrong");
		}
	}

}
