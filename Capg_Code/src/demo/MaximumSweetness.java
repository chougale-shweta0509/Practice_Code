package demo;

import java.util.Scanner;

public class MaximumSweetness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        int n = sc.nextInt();

        // Initialize largest and second-largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Input: Sweetness levels of ingredients and find the two largest values
        for (int i = 0; i < n; i++) {
            int sweetness = sc.nextInt();

            // Update largest and second-largest values
            if (sweetness > largest) {
                secondLargest = largest;
                largest = sweetness;
            } else if (sweetness > secondLargest) {
                secondLargest = sweetness;
            }
        }

        // Output the product of the two largest values
        System.out.println(largest * secondLargest);
    }
}
