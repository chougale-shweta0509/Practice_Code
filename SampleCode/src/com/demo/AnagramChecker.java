package com.demo;

import java.util.Arrays;

public class AnagramChecker {
	
	public static boolean anagramCheck(String str1, String str2) {
		
		//to lowercase
		 str1 = str1.replaceAll("\\s+", " ").toLowerCase();
		 str2 = str2.replaceAll("\\s+", " ").toLowerCase();
		 
		 //check the length
		 if(str1.length() != str2.length()) {
			 return false;
		 }
		 
		 //split the string
		 char[] str1char = str1.toCharArray();
		 char[] str2char = str2.toCharArray();
		 
		 //sort the string
		 Arrays.sort(str1char);
		 Arrays.sort(str2char);
		 
		 //check equals
		 return Arrays.equals(str1char, str2char);
	}
	public static void main(String[] args) {
		String str1 = "Slient";
		String str2 = "Listen";
		
		//store result of anagramcheck method
		boolean result = anagramCheck(str1, str2);
		System.out.println("Are "+str1+ " And "+str2+ " anagram");
	}
}
