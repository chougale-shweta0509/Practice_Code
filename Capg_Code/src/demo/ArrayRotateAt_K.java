package demo;

import java.util.Arrays;

public class ArrayRotateAt_K {

    public static void main(String[] args) {
        ArrayRotateAt_K arrayRotator = new ArrayRotateAt_K();
        
        // Example array and rotation
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(nums));
        
        // Rotate the array
        arrayRotator.rotate(nums, k);
        
        // Print the rotated array
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length; // Handle cases where k is greater than the length of the array
        reverse(nums, 0, nums.length - 1); // Corrected to nums.length - 1
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Corrected to nums.length - 1
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
