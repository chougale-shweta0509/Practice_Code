package demo;
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaxMinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        int n = sc.nextInt();
        int[] A = new int[n];

        // Input: Elements of the array
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Call function to calculate the minimum Max(B) - Min(B) after transfers
        long result = minimizeMaxMinDifference(A);
        System.out.println(result);
    }

    // Function to calculate the minimum Max(B) - Min(B) after transfers
    public static long minimizeMaxMinDifference(int[] A) {
        // Sort the array
        Arrays.sort(A);

        long ans = 0;  // Initialize the answer
        int currentMin = A[0];  // Minimum value in B
        int currentMax = A[0];  // Maximum value in B

        // Transfer elements in sorted order
        for (int i = 0; i < A.length; i++) {
            // Update max and min based on the current element being transferred
            currentMax = Math.max(currentMax, A[i]);
            currentMin = Math.min(currentMin, A[i]);

            // Add the current difference to ans
            ans += (currentMax - currentMin);
        }

        return ans; // Return the minimized sum
    }
}
