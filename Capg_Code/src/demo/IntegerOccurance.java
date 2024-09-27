package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class IntegerOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> countmap = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int num : arr) {
			countmap.put(num, countmap.getOrDefault(num, 0) + 1);
			
			if(countmap.get(num) == 1) {
				stack.push(num);
			}
		}
		
		while(!stack.isEmpty()) {
			int num = stack.pop();
			System.out.println(num + " occurs "+ countmap.get(num)+ " times ");
		}
		sc.close();
	}
}
