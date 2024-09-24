package demo.InPlaceReverse;

import java.util.Scanner;

public class Reverse{
	
//declare a function of logic
	public static void reverse(int[] arr,int start, int end) {
		start = 0;
		end = arr.length-1;
		
		while(start>end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//revered
		reverse(arr, 0, size-1);
		System.out.println("Reversed");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]+" ");
		}
		sc.close();
	}
}