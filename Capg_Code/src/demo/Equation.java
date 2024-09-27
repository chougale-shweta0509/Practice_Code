package demo;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting input for a, b, and c (though c is not used)
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();  // c is not used in the calculation

        // Calculate the result of the equation
        double result = calculateEquation(a, b);

        // Output the result
        System.out.println("The result of the equation is: " + result);

        scanner.close();
    }

    // Function to calculate the equation
    public static double calculateEquation(double a, double b) {
        return Math.pow(a, 3) + 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2) + Math.pow(b, 3);
    }
}

