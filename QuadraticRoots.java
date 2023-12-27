import java.util.Scanner;

public class QuadraticRoots {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

        // Input coefficients from the user
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discrimi = b * b - 4 * a * c;

        // Check the nature of roots
        if (discrimi > 0) {
            double root1 = (-b + Math.sqrt(discrimi)) / (2 * a);
            double root2 = (-b - Math.sqrt(discrimi)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discrimi == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots. Roots are complex.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(Math.abs(discrimi)) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        // Close the scanner
        scanner.close();
    }
}
