package demo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractAddSortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		
		//extract and split in array
		String[] words = str.split(" ");
		
		//sort
		Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Sorted Array :"+Arrays.toString(words));
	}

}
