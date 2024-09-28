package demo;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		
		int month = sc.nextInt();
		String season = getSeason(month);
		
		System.out.println("Season is : "+season);

	}

	public static String getSeason(int month) {
        if (month < 1 || month > 12) {
            return "Invalid Month Entered";
            
        } else if (month >= 3 && month <= 5) {
            return "Spring Season";
            
        } else if (month >= 6 && month <= 8) {
            return "Summer Season";
            
        } else if (month >= 9 && month <= 11) {
            return "Autumn Season";
            
        } else {
            return "Winter Season";
        }
    }

}
