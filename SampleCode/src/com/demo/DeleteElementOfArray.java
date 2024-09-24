package com.demo;

import java.util.Arrays;

public class DeleteElementOfArray {

	public static void main(String[] args) {
		
		int[] originalArray = {1,2,3,4,5};
		
		int element = 3;
		
		int[] newArray = remove(originalArray, element);
		
		System.out.println("Original Array "+ Arrays.toString(originalArray));
		System.out.println("NewArray "+ Arrays.toString(newArray));
	
	}
	
	public static int[] remove(int[] array, int element) {
		
		//new array to store iterated elements
		int[] newArray = new int[array.length - 1];
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != element) {
				newArray[index] = array[i];
				index++;
			}
		}
		return newArray;
	}

}
