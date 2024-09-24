package com.demo.service1;

import java.util.Scanner;

public class MinMax {
	
	public static int min(int[] arr, int N) {
		int mini = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			if(arr[i] < mini) {
				mini = arr[i];
			}
		}
		return mini;
	}
	
	
	public static int max(int[]arr, int N) {
		int maxx = Integer.MIN_VALUE ;
		for(int i = 0; i < N; i++) {
			if(arr[i] > N) {
				maxx = arr[i];
			}
		}
		return maxx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		// display min and max 
		System.out.println("Minimum : " +min(arr , size));
		System.out.println("Maximum : "+ max(arr, size));
		

	}

}
