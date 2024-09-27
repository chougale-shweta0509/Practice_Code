package demo;

import java.util.Scanner;

public class HighestMarks {
	
	//bit wrong

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of semester ");
		int semester = sc.nextInt();
		int[] maxMarks = new int[semester];
		
		for(int i = 0; i < semester; i++) {
			System.out.println("Enter the num of sub of semester " + (i + 1)+" : ");
			int numSub = sc.nextInt();
			
				System.out.println("Obtained marks in semester "+(i + 1)+ " : ");
				String marks = sc.next();
				String[] marksArray = marks.split("");
				
				int maxMark = -1; // initialize as invalid maeks
				
				for(String m1 : marksArray) {
					//parse to convert string to integer
					int markValue = Integer.parseInt(m1);
					if(markValue < 0 || markValue > 100) {
						System.out.println("Invalid marks entered");
					}else {
						if(markValue > maxMark) {
							maxMark = markValue;
						}
					}
				}
					  maxMarks[i] = maxMark;
		}
		
		//print maximum marks
		for(int i = 0; i < semester ; i++) {
			if(maxMarks[i] != 0) {
				System.out.println("Maximum mark in semester "+ (i + 1) + maxMarks[i]);
			}else {
				System.out.println("no valid marks for seem : " + (i + 1));
			}
		}
	
	}

}
