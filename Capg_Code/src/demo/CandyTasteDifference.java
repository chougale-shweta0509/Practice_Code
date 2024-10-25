package demo;
import java.util.Scanner;

public class CandyTasteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        int n = sc.nextInt();

        // Initialize the first element to max and min to avoid extra checks
        int minTaste = Integer.MAX_VALUE;
        int maxTaste = Integer.MIN_VALUE;

        // Input: Taste levels of candies and find min and max
        for (int i = 0; i < n; i++) {
            int taste = sc.nextInt();
            minTaste = Math.min(minTaste, taste);
            maxTaste = Math.max(maxTaste, taste);
        }

        // Output the difference between the max and min taste levels
        System.out.println(maxTaste - minTaste);
    }
}
