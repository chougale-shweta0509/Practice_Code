package demo;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_Element {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 5, 5, 6};
        
        List<Integer> result = duplicate(nums);
        
        System.out.println("Duplicate: " + result);
    }

    private static List<Integer> duplicate(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Find the index
            
            if (nums[index] < 0) { // If the value at index is negative, it’s a duplicate
                res.add(Math.abs(nums[i])); // Add the duplicate to the result
            } else {
                nums[index] = -nums[index]; // Mark as seen by making it negative
            }
        }
        
        return res;
    }
}

//to remove duplicates......
//private static int duplicate(int[] nums) {
//	//two pointer 
//	int j = 0;
//	for(int i = 1; i < nums.length; i++) {
//		if(nums[i] != nums[j]) {
//			 j++;
//			 nums[i] = nums[j];
//		}
//	}
//	return j + 1;
//}