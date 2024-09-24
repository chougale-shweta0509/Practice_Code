package com.demo.string;

import java.util.HashMap;
import java.util.Map;

public class EachWordOccurance {

	public static void main(String[] args) {
		String str = "Alice is girl Bob is boy";
		Map<String, Integer> map = new HashMap<>();
		//split String & store in array
		String[] words = str.split(" ");
		//key i.e object key
		for(String key : words) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}

}
