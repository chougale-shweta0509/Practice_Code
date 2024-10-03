package demo;

public class Maxi_Sub_Array {

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Finding the maximum sub array sum
        int maxSum = maxSubArray(nums);
        
        // Printing the result
        System.out.println("The maximum subarray sum is: " + maxSum);

	}
	 public static int maxSubArray(int[] nums) {
		 
		 if(nums == null || nums.length == 0) {
			 throw new IllegalArgumentException("Array can't be null");
		 }
		 
		 int max_num = nums[0];
		 int cur_num = nums[0];
		 
		 for(int i = 0; i < nums.length; i++) {
			 
			 cur_num = Math.max(nums[i], cur_num + nums[i] );
			 max_num = Math.max(max_num, cur_num);
		 }
		 return max_num;
	 }
}
