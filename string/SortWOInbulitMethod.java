package com.demo.string;

public class SortWOInbulitMethod {

	public static void main(String[] args) {
		int[] arr = {3, 2, 8, 6, 4, 9, 1};
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.println("Sorted array : "+ arr[i]);
		}
		//third largest num of array
		System.out.println("Third num : "+ arr[size - 3]);

	}

}
