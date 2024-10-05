package demo;

public class Matrix_90_Rotate {

    public static void main(String[] args) {
        // Create a sample 2D matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix 90 degrees clockwise
        matrix_90_Rotation(matrix);

        // Print the rotated matrix
        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }

    public static void matrix_90_Rotation(int[][] matrix) {
        // 1st step: transpose the matrix
        transpose(matrix);
        
        // 2nd step: reverse each row
        reverse(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) { // Fixed j index
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int si = 0;
            int endi = matrix.length - 1;
            while (si < endi) {
                // Swap elements
                int temp = matrix[i][si];
                matrix[i][si] = matrix[i][endi];
                matrix[i][endi] = temp;
                si++;
                endi--;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
