package com.demo.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArray {

	public static void main(String[] args) {
		
			Integer[] array1 = {3, 9, 1, 5, 7};
			Integer[] array2 = {5, 3, 1, 0};
			
		/*		List<Integer> commonelement = new ArrayList<>();
				for(int i = 0; i<array1.length; i++) {
				for(int j = 0; j < array2.length; j++) {
					if(array1[i] == array2[j]) {
						commonelement.add(array1[i]);
					}
				}
			}
			System.out.println("CommonElement : "+commonelement);
		*/
			
			List<Integer> l1 = new ArrayList<>(Arrays.asList(array1));
			List<Integer> l2 = new ArrayList<>(Arrays.asList(array2));
			
			l1.retainAll(l2);
			System.out.println("CommonElement = " + l1);
	}

}
