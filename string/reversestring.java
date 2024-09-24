package com.demo.string;

import java.util.Scanner;
import java.util.Stack;

public class reversestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
	
			Stack <Character> stack = new Stack<>();
			char[] character = str.toCharArray();
			
			for(char c : character) {
				stack.push(c);
			}
			
			for(int i = 0; i<str.length(); i++) {
				character[i] = stack.pop();
				System.out.print( character[i]);
			}
			
		/*StringBuffer buf = new StringBuffer(str);
		buf.reverse();
		System.out.println(buf);*/
	}

}
