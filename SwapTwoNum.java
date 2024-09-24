package com.demo.array;

public class SwapTwoNum {

	public static void main(String[] args) {
		int a = 100, b = 200;
		 
		//using 3 variable
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After swapping a = "+a+" and b = "+b);
		
		// using 2 variables
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println("After swapping a = "+a+" and b = "+b);

		// swap a and b using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping a = "+a+" and b = "+b);

	}

}
