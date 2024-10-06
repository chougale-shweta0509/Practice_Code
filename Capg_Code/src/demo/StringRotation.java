package demo;

public class StringRotation {

	public static void main(String[] args) {
		String s = "abcdef";
		String goal = "bcdefa";
		
		 boolean isRotation = rotation(s, goal);
	        System.out.println("Is \"" + goal + "\" a rotation of \"" + s + "\"? " + isRotation);
	}
	
	public static boolean rotation(String s, String goal) {
		return(s.length() == goal.length() && (s + s).contains(goal));
	}

}
