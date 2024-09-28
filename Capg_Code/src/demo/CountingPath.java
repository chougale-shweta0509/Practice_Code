package demo;

import java.util.Scanner;

public class CountingPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int steps = sc.nextInt();
		sc.nextLine();
		
		String path = sc.nextLine();
		int valleys = countValley(steps, path);
		
		System.out.println("Enter the count : "+valleys);

	}

	private static int countValley(int steps, String path) {
		int level = 0;
		int valleys = 0;
		boolean inValley = false;//set the flag
		
		for(char step : path.toCharArray()) {
			if(step == 'U') {
				level++;
			}else if(step == 'D') {
				level--;
			}
			
			if(level < 0) {
				inValley = true;//we are in valley
			}
			
			if(level == 0 && inValley) {
				valleys++;
				inValley = false; //flag reset
			}
			
		}
		
		return valleys;
	}

}
