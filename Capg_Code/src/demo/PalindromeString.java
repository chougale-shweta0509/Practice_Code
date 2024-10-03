package demo;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		StringBuffer buf = new StringBuffer(str);
		buf.reverse();
		
		String str1  = buf.toString();
		System.out.println(str1);
		
		if(str1.equals(str)) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Not palindrom");
		}
	}

}
