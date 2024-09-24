package demo.practice;

public class AreaofCube {

	public static void main(String[] args) {
		double diagonal = 10;//length of diagonal
		// measure sides of diagonal
		double side = diagonal/Math.sqrt(3);
		//area of diagonal
		double area = 6 * side * side;
		System.out.println(area+" area of cube");

	}

}
