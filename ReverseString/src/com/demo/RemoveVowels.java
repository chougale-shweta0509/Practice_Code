package com.demo;

import java.util.Set;

public class RemoveVowels {
	public static String removevowel(String str) {
		Set<Character> vowel = Set.of('a', 'e', 'i', 'o', 'u');
		//string builder is used to immutable string to mutable
		StringBuilder sd = new StringBuilder();
		
		char[] chas = str.toCharArray();
		for(char ch : chas) {
			//if array contains vowel
			if(!vowel.contains(ch)) {
				//append the characters
				sd.append(ch);
			}
		}
		//toString is for passing back the string
		return sd.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(removevowel("ice cream"));
	}

}
