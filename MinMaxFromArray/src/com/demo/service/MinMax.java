package com.demo.service;

public class MinMax {
	 // Helper class to store the pair of min and max
    static class Pair {
        int min;
        int max;
        
        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    // Function to find min and max in an array
    public static Pair findMinMax(int[] arr, int low, int high) {
        // If there is only one element
        if (low == high) {
            return new Pair(arr[low], arr[low]);
        }

        // If there are two elements
        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                return new Pair(arr[low], arr[high]);
            } else {
                return new Pair(arr[high], arr[low]);
            }
        }

        // If there are more than two elements
        int mid = (low + high) / 2;
        Pair leftPair = findMinMax(arr, low, mid);
        Pair rightPair = findMinMax(arr, mid + 1, high);

        // Combine results from both halves
        int min = Math.min(leftPair.min, rightPair.min);
        int max = Math.max(leftPair.max, rightPair.max);

        return new Pair(min, max);
        
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 4, 9, 2};
        Pair minMax = findMinMax(arr, 0, arr.length - 1);
        
        System.out.println("Minimum: " + minMax.min);
        System.out.println("Maximum: " + minMax.max);
    }
}	 
		 
		 
	 
	 

