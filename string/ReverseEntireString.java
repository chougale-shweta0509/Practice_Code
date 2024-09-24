package com.demo.string;

public class ReverseEntireString {

	public static void main(String[] args) {
		String str = "India is Country My";
		String[] arr = str.split(" ");
		
		String ans = "";
		for(int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}
		System.out.println(ans.substring(0, ans.length() - 1));
	}

}
