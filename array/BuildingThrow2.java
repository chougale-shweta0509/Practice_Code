package demo.array;
import java.util.Scanner;

public class BuildingThrow2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N and Kt
        System.out.println("Enter the N");
        int N = scanner.nextInt();
        System.out.println("Enter the K");
        int K = scanner.nextInt();
        
        // Read array A
        int[] heights = new int[N];
        System.out.println("Enter the array inputs given in que");
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        
        // Initialize counters
        int count = 0;
        int maxHeight = -1;
        int oddHeightCount = 0;
        
        // Iterate through the buildings
        for (int i = 0; i < N; i++) {
            // Check if current building's height is greater than maxHeight
            boolean canThrowBall = (heights[i] > maxHeight);
            
            // Check if oddHeightCount is less than K
            canThrowBall = canThrowBall && (oddHeightCount < K);
            
            // If both conditions are met, increment the count
            if (canThrowBall) {
                count++;
            }
            
            // Update maxHeight and oddHeightCount
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
            if (heights[i] % 2 == 1) {
                oddHeightCount++;
            }
        }
        
        // Print the result
        System.out.println("count "+count);
    }
}