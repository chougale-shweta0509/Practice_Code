package demo.array;

import java.util.Arrays;

public class ChocolateDistribute {
		
	public static int Chocolate(int[] num, int m) {
		
		if(num.length == 0 || m == 0) {
			return 0;
		}
		
		Arrays.sort(num);
		
		//check if their are enough no of packets for students 
		if(num.length -1 < m) {
			return -1;
		}
		
        // Initialize minimum difference to the maximum possible integer value
		int min_diff = Integer.MAX_VALUE;
		
		for(int i=0; i<num.length; i++) {
			int nextWindow  = i+m-1;
			
			if(nextWindow >= num.length) 
				break;
			
			int diff = num[nextWindow] - num[i];
			 
 
            // Update the minimum difference if a smaller difference is found
            min_diff = Math.min(min_diff, diff);
        }
 
        // Return the calculated minimum difference
        return min_diff;
    }
 
    public static void main(String[] args) {
        // Example input
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        // Calculate the result using the chocolateDistribution method
        int result = Chocolate(arr, m);
 
        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
