package demo.practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		//Reverse the string eg.hi=ih;
		//StringBuilder=helps to modifiable sequence of character
		//str passed to stringbuilder constructor to create new obj 
		//reverse = it reverse the string
		//toString = converts the ob to string
		String reverse = new StringBuilder(str).reverse().toString();
		//check whether it is palindrome
		if(str.equals(reverse)) {
			System.out.println(str+" Is a Palindrome");
		}else {
			System.out.println(str+" Is not palindrome");
		}
	}

}
