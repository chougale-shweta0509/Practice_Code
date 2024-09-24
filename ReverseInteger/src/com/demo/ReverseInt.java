package com.demo;
import java.util.Scanner;

public class ReverseInt {
	
	public int reverse(int x){
		long reverse = 0;
		int rem = 0;
		int num = x;
		
		while(num != 0) {
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}
		
		if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
			return 0;
		}

		return (int)reverse;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer");
		int x = sc.nextInt();
		
		ReverseInt r = new ReverseInt();
		int ans = r.reverse(x);
		
		System.out.println(ans+"");
	}

}
