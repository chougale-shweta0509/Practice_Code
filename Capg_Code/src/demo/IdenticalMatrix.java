package demo;

public class IdenticalMatrix {

	public static void main(String[] args) {
		 int[][] matrixA = {
		            {1, 1, 1, 1},
		            {2, 2, 2, 2},
		            {3, 3, 3, 3},
		            {4, 4, 4, 4}
		        };
		        
		        int[][] matrixB = {
		            {1, 1, 1, 1},
		            {2, 2, 2, 2},
		            {3, 3, 3, 3},
		            {4, 4, 4, 4}
		        };
		        
		        if (areIdentical(matrixA, matrixB)) {
		            System.out.println("Matrices are identical");
		        } else {
		            System.out.println("Matrices are not identical");
		        }

	}

	private static boolean areIdentical(int[][] matrixA, int[][] matrixB) {
		
		if(matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
			return false;
		}
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixA[i].length; j++) {
				if(matrixA[i][j] != matrixB[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
