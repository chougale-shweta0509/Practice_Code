package com.demo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "aabbccde";
		char c = nonRepeatedChar(str);
		System.out.println(c);

	}

	private static char nonRepeatedChar(String str) {
		Map <Character, Integer> countMap = new HashMap<>();
		//split string in character
		for(char ch : str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
		}
		
		for(Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		return 0;
	}

}
