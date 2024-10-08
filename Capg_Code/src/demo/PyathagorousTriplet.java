package demo;

public class PyathagorousTriplet {

	public static void main(String[] args) {
		int limit = 20;
		pythagoreanTriplet(limit);

	}

	private static void pythagoreanTriplet(int limit) {
		for(int a = 1; a < limit; a++) {
			for(int b = a; b < limit; b++ ) {
				int c = (int) Math.sqrt(a * a + b * b);
				if(c < limit && a * a + b * b == c * c) {
					System.out.println(a + " " + b + " " + c);
				}
			}
		}
		
	}

}
