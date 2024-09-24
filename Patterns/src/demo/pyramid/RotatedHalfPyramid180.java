package demo.pyramid;

public class RotatedHalfPyramid180 {

	public static void main(String[] args) {
		int n = 4;
//		
//		//to left side
//		for(int i=1; i<=n; i++) {
//			//inner loop->spaces
//			for(int j=1; j<=n-1; j++){
//				System.out.print(" ");
//			}
//			//inner loop->star
//			for(int j=i; j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//to rightside
		for(int i=1; i<=n; i++) {
			//inner loop->space
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			//inner loop->star
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
