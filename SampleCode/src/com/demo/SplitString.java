package com.demo;

public class SplitString {

	public static void main(String[] args) {
		String str = "091-9011665632";
		String s[] = str.split("-");
		splitString(s, str);
		
	}
	
	public static void  splitString(String str[], String approach) {
		
		System.out.println("Split using array "+approach);
		for(String s1 : str) {
			System.out.println(s1);
		}
	}
}
