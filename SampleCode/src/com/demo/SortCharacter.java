package com.demo;

import java.util.Arrays;

public class SortCharacter {

	public static void main(String[] args) {
		String str = "shweta";
		
		char[] chr = str.toCharArray();
		Arrays.sort(chr);
		
		String str2 = new String(chr);
		System.out.println(str2);

	}

}
