package demo.pyramid;

public class HalfPyramid {

	public static void main(String[] args) {
		// int n = row = 4;
		
		int n = 4;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
