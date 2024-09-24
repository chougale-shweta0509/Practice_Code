package com.demo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "Samayra";
		System.out.println(removeDuplicate(str));
		
	}
	
	public static String removeDuplicate(String str) {
		Set<Character> chat = new HashSet<>();
		//to make string mutable use Stringbuffer
		StringBuffer bf = new StringBuffer();
		
		for(int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(!chat.contains(c)) {
				chat.add(c);
				bf.append(c);
			}
		}
		return bf.toString();
	}

}
