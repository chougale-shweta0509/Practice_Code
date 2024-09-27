package demo;

public class RepeatedStringCount {

	public static void main(String[] args) {
		
		String input = "aabbbbccdddeeeff";
		String output = stringCompress(input);
		System.out.println(output);
	}

	public static String stringCompress(String s) {
		if(s == null || s.isEmpty()) {
			return "";
		}
		
		StringBuilder bf  = new StringBuilder();
		int count = 1;
		
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}else {
				bf.append(s.charAt(i - 1));
				bf.append(count);
				count = 1;
			}
		}
		
		bf.append(s.charAt(s.length() - 1));
		bf.append(count);
		
		return bf.toString();
	}

}
