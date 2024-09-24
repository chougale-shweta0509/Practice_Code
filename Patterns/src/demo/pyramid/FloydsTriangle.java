package demo.pyramid;

public class FloydsTriangle {

	public static void main(String[] args) {
		int n=5;
		int number=1;
		
		
//		for(int i=1; i<=n; i++){
//			for(int j=1; j<=i; j++) {
//				//it will j and on next line it will print increase by 1
////				1
////				12
////				123
////				1234
////				12345
//				System.out.print(j);
//				number++;
//			}
//			System.out.println();
//		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number+" ");
				//after printing num=1; then onwards it increse by 1 
				number++;
			}
			System.out.println();
		}
	}

}
