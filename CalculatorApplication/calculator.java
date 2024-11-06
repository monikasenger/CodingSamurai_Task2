package CalculatorApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
	static Scanner sc=new Scanner(System.in);
    

    // Get user choice for operation
    public static int getUserChoice() {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 5) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid choice......\nPlease enter a number between 1 and 5: ");
            }
        }
        return choice;
    }

    // Get two numbers from user
    public static double[] getTwoNumbers() {
        double[] numbers = new double[2];
        System.out.print("\n Enter the first number: ");
        numbers[0] = getValidNumber();
        System.out.print("Enter the second number: ");
        numbers[1] = getValidNumber();
        return numbers;
    }

    // Get valid double input from user
    public static double getValidNumber() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input....\nPlease enter a valid number: ");
            }
        }
    }

    // Perform selected operation
    public static double performOperation(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                return add(num1, num2);
            case 2:
                return subtract(num1, num2);
            case 3:
                return multiply(num1, num2);
            case 4:
                return divide(num1, num2);
            default:
                return 0;
        }
    }

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division with error handling for division by zero
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.......");
            return 0;
        }
        return a / b;
    }
}