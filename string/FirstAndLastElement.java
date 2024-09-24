package com.demo.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLastElement {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
//		int[] arr = new int[5];
//		System.out.println("Enter the number");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("Print element : ");
//			arr[i] = sc.nextInt();
//		}
		
		int[] arr = {3, 6, 1, 7, 8};
		
//		ArrayList<Integer> l1 = new ArrayList<Integer>(5);
//		int first = l1.get(0);
//		//System.out.println("First : " + first);
//		
//		int last = l1.get(l1.size()-1);
//		//System.out.println("Last : "+last);

		
		int first = arr[0];
		System.out.println(first);
		
		int last = arr[arr.length - 1];
		System.out.println(last);
		
	}

}
