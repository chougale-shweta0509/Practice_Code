package com.demo.service;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSort {
	
	static class pair{
		
		int min; int max;
	}
	
	static public pair getminmax(int[] arr, int n) {
		
		pair minmax = new pair();
		
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n -1];
		
		return minmax;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
			pair minmax = getminmax(arr, size);
		System.out.println("Minimum is:" +minmax.min);
		System.out.println("Maximun is: "+minmax.max);
	}	

}
