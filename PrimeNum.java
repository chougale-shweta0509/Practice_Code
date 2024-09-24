package com.demo.array;

public class PrimeNum {

	public static void main(String[] args) {
		int num = 3;
		int count = 0;
		if(num <= 1) {
			System.out.println("Is not prime");
			return;
		}
		for(int i=2; i<=num/2; i++) {
			if(num % 2 == 0) {
				count++;
			}
			if(count > 1) {
				System.out.println("Not Prime");
			}else {
				System.out.println("Is prime");
			}
		}
	}

}
