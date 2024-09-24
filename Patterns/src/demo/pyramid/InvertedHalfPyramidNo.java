package demo.pyramid;

public class InvertedHalfPyramidNo {

	public static void main(String[] args) {
		int n=5;
		//prints 12345
//				 2345
//				 345
//				 45
//				 5
// prints the ith value at 1st
//		for(int i=1; i<=n; i++) {
//			for(int j=i; j<=n-i+i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=n; i++) {
			
			//if j<=n-1+1 it will print all matrix upto 1-5
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
