package demo.practice;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		//initialize the array
		int[] arr = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0; i<size-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Logic Bubble Sort
		for(int i=0; i<size-1; i++){
			for(int j=0; j<size-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
							
				}
			}
			
		}
		System.out.println("Sorted Array");
		for(int i:arr) {
			System.out.println(i+ " ");
		}
		
	}

}

