package com.demo;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
	public static int uniquechar(String s) {
		//hashmap to store
		Map <Character, Integer> uniqchar = new HashMap<>();
		//store string in array 
		char[] chas = s.toCharArray();
		for(char ch : chas) {
			//put to store char in key value 
			//+1 to non-repeated char
			uniqchar.put(ch, uniqchar.getOrDefault(ch, 0) + 1);
		}
		
		for(int i=0; i<chas.length; i++) {
			//store index of non-repeated char
			char ch = chas[i];
			if(uniqchar.get(ch) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//Call by method
		System.out.println(uniquechar("aabac"));
	}

}
