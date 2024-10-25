package demo;
import java.util.Scanner;

public class NegativeProductSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: Elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function to count subsequences with negative product
        long result = countNegativeProductSubsequences(arr);
        System.out.println(result);
    }

    // Function to count subsequences with a negative product
    public static long countNegativeProductSubsequences(int[] arr) {
        int pos = 0, neg = 0, zero = 0;

        // Count positive, negative, and zero elements
        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;
        }

        // Total number of non-zero subsequences
        long totalSubsequences = (1L << (pos + neg)) - 1; // 2^(pos + neg) - 1

        // Count even negative subsequences
        long evenNegativeSubsequences = 0;
        for (int k = 0; k <= neg; k += 2) {
            evenNegativeSubsequences += nCr(neg, k);
        }
        evenNegativeSubsequences *= (1L << pos); // Include positive numbers

        // Count odd negative subsequences
        long oddNegativeSubsequences = totalSubsequences - evenNegativeSubsequences;

        // If there are zeros, they can be included in all combinations
        if (zero > 0) {
            oddNegativeSubsequences *= (1L << zero); // Each zero can be included or not
        }

        return oddNegativeSubsequences;
    }

    // Helper function to calculate nCr (combinations)
    public static long nCr(int n, int r) {
        if (r > n || r < 0) return 0; // If r is greater than n or negative, return 0
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }
}
