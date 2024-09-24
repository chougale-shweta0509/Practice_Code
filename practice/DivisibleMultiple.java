package demo.practice;

public class DivisibleMultiple {

	public static void main(String[] args) {
		//divisible by 7 and multiple of 5 between 20 to 100
		for(int i=20; i<=100; i++) {
			if(i%7==0 && i%5==0) {
				System.out.println("Divisibleby7 And MultipleOf 5 "+i);
			}
		}
	}

}
