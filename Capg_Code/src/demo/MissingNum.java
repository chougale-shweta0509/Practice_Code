package demo;

public class MissingNum {

	public static void main(String[] args) {
		
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int result = missingNum(nums);
		System.out.println(result);

	}

	private static int missingNum(int[] nums) {
		
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		
		int actualSum = nums.length*(nums.length+1)/2;
		int missingnum = actualSum - sum;
		
		return missingnum;
	}
	

}
