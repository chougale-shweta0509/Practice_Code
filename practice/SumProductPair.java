package demo.practice;

import java.util.Scanner;

public class SumProductPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//read the inputs
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		//initialize array
		int[] arr = new int[n];
		
		//2nd line contains n space-separated integer
		//1 to n
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int pairCount=0;
		int sumProduct=0;
	
		//no. of each pair & sum of their product
	
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++) {
				pairCount++;
				System.out.println(i);
				System.out.println(j);
				sumProduct += arr[i]*arr[j];
			}
		}
		//print the sum of product
		System.out.println("pairCount :"+pairCount+" sumProduct: "+sumProduct);
		sc.close();
	}

}
