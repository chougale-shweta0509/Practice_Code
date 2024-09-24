package demo.pyramid;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		//int row = n =4;
		int n = 4;
		
		//print outter loop with decrement of n -1;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
