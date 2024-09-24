package com.demo.string;

import java.util.Arrays;

public class SecondLargeAndSmallNum {

	public static void main(String[] args) {
		int[] arr = {4, 2, 5, 1, 0 , 6, 7, 8};
		int num = arr.length;
		
		Arrays.sort(arr);

		System.out.println("Second Large Number : "+arr[num - 2]);
		System.out.println("Second Small Number : "+arr[1]);
	}

}
