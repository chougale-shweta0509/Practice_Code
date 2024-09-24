package com.demo.string;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		str = str.replaceAll("\\s","");
		System.out.println("final string = "+str);

	}

}
