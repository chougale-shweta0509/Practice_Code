package demo.array;

import java.util.Scanner;

public class SumofIndices1 {

	public static void main(String[] args) {
		//sum of indices p and q
		
		Scanner sc = new Scanner(System.in);
		
		//to handle inputs
        System.out.println("Enter the P");
		int P = sc.nextInt();
        System.out.println("Enter the Q");
		int Q = sc.nextInt();
		
		//base result
		int result = -404;
		
		//check edge case p and q p is always less than q
		if(P > Q) {
			System.out.println(result);
			return;
		}
		
		//calculate sum of digit
		result = sumofDigit(P, Q);
		
		System.out.println("Result is"+result);


	}
	public static int sumofDigit( int P, int Q) {
		//initalize the value
		int sum =0;
		//track of index start from 
		int curr_index = 1;
		//reached upto digit working on
		int curr_digit = 1;
		
		//curr should be in p and q range
		while(curr_index <= Q) {
			//next_index for add upto that digit
			int next_index = curr_index + curr_digit-1;
			
			//p is less than end digit
			//range(curr_index to next_index
			if(P <= next_index) {
				int start = Math.max(P, curr_index);
				int end = Math.min(Q, next_index);
				//sum
				sum = sum+(end - start+1)*curr_digit;
			}
		
			curr_index = next_index + 1;
			//increment digit after sum
			curr_digit++;
		}		
		return sum;
	}

}
