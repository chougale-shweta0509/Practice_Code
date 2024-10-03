package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged1 = merge(intervals1);
        System.out.println("Merged intervals 1: " + Arrays.deepToString(merged1));

        // Example 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] merged2 = merge(intervals2);
        System.out.println("Merged intervals 1: " + Arrays.deepToString(merged2));

	}
	
	public static int[][] merge(int[][] intervals){
		if(intervals.length <= 1) {
			return intervals;
		}
		
		//sort array
		Arrays.sort(intervals, Comparator.comparing(i -> i[0]));
		
		List<int[]> result = new ArrayList<>();
		
		int[] newinterval = intervals[0];
		result.add(newinterval);
		
		//loop 
		for(int[] interval : intervals) {
			if(interval[0] <= newinterval[1]) {
				
				newinterval[1] = Math.max(newinterval[1], interval[1]); 
			}else {
				
				newinterval = interval;
				result.add(newinterval);
			}
		}
		return result.toArray(new int[result.size()][]);
	}
}
