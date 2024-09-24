package demo.practice;

public class Factorial {

	public static void main(String[] args) {
		int n=5; //first 5 no
		long fact = 1;
		
		for(int i=1; i<=n; i++) {
			
			fact = fact*i;
			for(int j=i; j<=i; j++) {
				System.out.println(i+"! = "+fact);
			}
		}
		System.out.println("Factorial of "+n +" is "+fact);
		
	}

}
