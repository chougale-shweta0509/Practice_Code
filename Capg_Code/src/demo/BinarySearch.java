package demo;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5; // The number we want to search for

        // Call the binary search method
        int result = binary(nums, target);
        
        // Output the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
	}
	
	private static int binary(int[] nums, int target) {
		
		int mid;
		int left = 0;
		int right = nums.length;
		//to get the mid and target
		while(left <= right) {
			mid = left + (right - left)/2;
			if(nums[mid] == target) {
				return mid;
			}
			if(target < nums[mid]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
