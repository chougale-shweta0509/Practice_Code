package demo.practice;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num ");
		int num = sc.nextInt();
		
		//print the table
		for(int i=1; i<=10; i++) {
			
			int table = num*i;
			System.out.println(i+ " *"+" = "+table );
		}

	}

}
