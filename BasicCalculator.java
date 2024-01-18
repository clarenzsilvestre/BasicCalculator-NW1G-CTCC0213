package clarenz.basiccalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("Simple Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            // Get user Choice
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            // Perform calculation based on user choice
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5");
            }
        }
    }

    private static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

