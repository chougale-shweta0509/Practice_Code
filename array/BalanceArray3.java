package demo.array;

import java.util.Scanner;

public class BalanceArray3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int mid = N / 2;
        int leftSum = 0;
        int rightSum = 0;
        
        // Calculate left sum
        for (int i = 0; i < mid; i++) {
            leftSum += arr[i];
        }
        
        // Calculate right sum
        for (int i = mid; i < N; i++) {
            rightSum += arr[i];
        }
        
        int diff = Math.abs(leftSum - rightSum);
        
        if (diff == 0) {
            System.out.println(0);
            return;
        }
        
        boolean found = false;
        for (int digit = 0; digit <= 9; digit++) {
            for (int index = 1; index <= N; index++) {
                int newLeftSum = leftSum;
                int newRightSum = rightSum;
                
                if (index < mid) {
                    newLeftSum += digit;
                } else {
                    newRightSum += digit;
                }
                
                if (newLeftSum == newRightSum) {
                    System.out.println(1);
                    System.out.println(digit);
                    System.out.println(index);
                    
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        
        if (!found) {
            System.out.println(-1); // No valid insertion found
        }
  
	}
}
