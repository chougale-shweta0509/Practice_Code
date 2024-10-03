package demo;

public class PrimeNum {

	public static void main(String[] args) {
		int num = 29;
		//flag
		Boolean IsPrime = true;
		
		if(num <= 1) {
			System.out.println("Not Prime");
			return;
		}
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				IsPrime = false;
				break; // break the loop 
			}
		}
		
		if(IsPrime) {
			System.out.println(num+ " Is Prime Number");
		}else {
			System.out.println("Not a prime");
		}
	}

}
