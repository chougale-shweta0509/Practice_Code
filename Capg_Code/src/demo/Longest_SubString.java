package demo;

import java.util.HashSet;
import java.util.Set;

public class Longest_SubString {

	public static void main(String[] args) {
		String str = "aabbccde";
		int length = longSubString(str);
	    System.out.println("Length of the longest substring without repeating characters: " + length);
	}

	private static int longSubString(String str) {
		int right = 0, left = 0;
		int max = 0;
		Set<Character> seen = new HashSet<>();
		
		while(right < str.length()) {
			char c = str.charAt(right);
			if(seen.add(c)) {
				max = Math.max(max, right - left + 1);
				right++;
			}else {
				while(str.charAt(left) != c) {
					seen.remove(str.charAt(left));
					left++;
				}
				seen.remove(c);
				left++;
			}
		
		}
		return max;
	}

}
