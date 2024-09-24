package demo.pyramid;

public class ButterflyPattern {

	public static void main(String[] args) {
//		int n = 5;
//		//for upper part
//		//i to n
//		for(int i=1; i<=n; i++) {
//			//1st part
//			for(int j=1; j<=i; j++){
//				System.out.print("*");
//			}
//			
//			//spaces
//			int spaces = 2 * (n-i);
//			for(int j=1; j<=spaces; j++) {
//			System.out.print(" ");
//			}
//			//2nd part
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//lower part
//		//n to i
//		for(int i=n; i>=1; i--) {
//			//1st part
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			
//			//spaces 
//			int spaces = 2 * (n-i);
//			for(int j=1; j<=spaces; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int n=5;
		//upper part
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//spaces
			int spaces = 2 * (n-i);
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//spaces
			int spaces = 2 * (n-i);
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			//2nd lower part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
