package demo.practice;

import java.util.Scanner;

public class MaxAreaObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//read the input 
		int n = sc.nextInt();
		sc.nextLine();
		
		//read binary string in input
		String binaryString = sc.nextLine();
		
		//initalize the array
		//convert the binaryString in integer array
		int[] arr = new int[binaryString.length()];
		
		
		 // Validate the length of the binary string
        if (binaryString.length() != n) {
            System.out.println("Error: The length of the binary string does not match the specified size.");
            sc.close();
            return;
        }
		
		//traverse through array
		for(int i=0; i<binaryString.length(); i++) {
			arr[i]=binaryString.charAt(i) - '0'; // convert char into int (0 and 1);
		}
		
		//count / trach  the maxArea obj
		int MaxArea = 0;
		int CurrentArea = 0;
		
		//traverse through the array
		for(int i=0; i<n; i++) {
			//check the elements form 1s continuous form from arr[]
			if(arr[i] == 1) {
				CurrentArea++;
			}else {
				//if elements form 0s continuous form from arr[]
				if(CurrentArea > MaxArea) {
					MaxArea = CurrentArea;
				}
				//Now initialize CurrentArea to 0 for next counting
				CurrentArea = 0;
			}
		}
		
		//Final check for MaxArea Obh
		if(CurrentArea > MaxArea) {
			MaxArea = CurrentArea;
		}
		
		System.out.println("MaxArea : "+MaxArea);
		sc.close();
	}
	
	
	

}
