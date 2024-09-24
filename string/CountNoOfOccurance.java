package com.demo.string;

public class CountNoOfOccurance {

	public static void main(String[] args) {
		String str = "Java is Programming language. And java widely used for testing.";
		String[] s = str.toLowerCase().split(" ");
		
		String word = "java";
		
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(word)) {
				count++;
			}
		}
		System.out.println("word is : "+word+" "+count);
	}

}
