package demo;

import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		//absulate number
		number = Math.abs(number);
		
		if(number == 0) {
			System.out.println("No Facter");
		}else {
			findFacter(number);
		}

	}

	private static void findFacter(int number) {
		
		StringBuilder factor = new StringBuilder();
		
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				if(factor.length () > 0) {
					factor.append(", ");
				}
				factor.append(i);
			}
		}
			
		System.out.println(factor.toString());
	}

}
