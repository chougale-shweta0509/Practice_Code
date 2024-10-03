package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionTwoArray {

	public static void main(String[] args) {
        //IntersectionTwoArray obj = new IntersectionTwoArray();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);
        
        // Print the result
        System.out.print("Intersection: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
	
    public static int[] intersection(int[] nums1, int[] nums2) {
    	
    	HashSet<Integer> set = new HashSet<>();
    	List<Integer> ans = new ArrayList<>();
    	
    	for(int num : nums1) {
    		set.add(num);
    	}
    	
    	for(int num : nums2) {
    		set.contains(num);
    		ans.add(num);
    		set.remove(num);
    	}
    	
    	int[] arr = new int[ans.size()];
    	for(int i = 0; i < ans.size(); i++) {
    		arr[i] = ans.get(i);
    	}
    	
    	return arr;
    }

}
