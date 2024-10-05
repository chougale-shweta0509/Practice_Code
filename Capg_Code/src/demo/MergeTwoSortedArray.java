package demo;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		 int[] nums1 = {1, 2, 3, 0, 0, 0}; // The last three elements are placeholders
	        int m = 3; // Number of elements in nums1
	        int[] nums2 = {2, 5, 6}; // The second array
	        int n = nums2.length; // Number of elements in nums2

	        // Merge the two arrays
	        mergeTwoArray(nums1, m, n, nums2);

	        // Print the merged array
	        System.out.println("Merged array: " + Arrays.toString(nums1));
	}
	public static void mergeTwoArray(int[] nums1, int m, int n, int[] nums2) {
		for(int j = 0, i = m; j< n; j++) {
			nums1[i] = nums2[j];
			i++;
		}
		Arrays.sort(nums1);
	}

}
