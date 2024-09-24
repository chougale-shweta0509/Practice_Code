package demo.practice;

public class Fibonacci {

	public static void main(String[] args) {
		//range of series
		int n = 10;
		int a = 0;
		int b = 1; //series start from 1
		
		System.out.println("Fibonacci Series");
		for(int i=1; i<=n; i++) {
			//series start with vale and sign
			System.out.println(a+" ");
			//the next term to be added
			int nextTerm = a+b;
			//assign values at position
			a=b;
			b=nextTerm;
			
		}

	}

}
