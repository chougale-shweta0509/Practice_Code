package demo.array;

public class MaxSubArray {
	public static int maxsubArray(int[] num) {
		//to handle exception of null array
		if(num == null || num.length == 0) {
			throw new IllegalArgumentException("Array cannot be null");
		}
		//declare the variable for sum and current
		int current_num = num[0];
		int max_sum = num[0];
		
		//to track and get max sub array
		for(int i=1; i<num.length; i++) {
			current_num = Math.max(num[i], current_num + num[i]);
			max_sum = Math.max(max_sum, current_num);
		}
		return max_sum;
	}
	public static void main(String[] args) {
		
		int[] num1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int[] num2 = {1};
		int[] num3 = {5, 4, -1, 7, 8};
		
		System.out.println(maxsubArray(num1));
		System.out.println(maxsubArray(num2));
		System.out.println(maxsubArray(num3));
	}

}
