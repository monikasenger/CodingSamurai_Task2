package CalculatorApplication;

import java.util.Scanner;

public class Calculator_Main {
	static calculator cal=new calculator();
	 static Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {
	      
	        boolean running = true;

	        System.out.println("********** Calculation Application **********");

	        while (running) {
	        	 System.out.println("\nPlease select an operation:");
	             System.out.println("1. Addition");
	             System.out.println("2. Subtraction");
	             System.out.println("3. Multiplication");
	             System.out.println("4. Division");
	             System.out.println("5. Exit");
	             System.out.print("Enter your choice: ");
	            int choice = cal.getUserChoice();

	            if (choice == 5) {
	                System.out.println("Exiting the calculator. Goodbye!");
	                running = false;
	            } else {
	                double[] numbers = cal.getTwoNumbers( );
	                double result = cal.performOperation(choice, numbers[0], numbers[1]);
	                System.out.printf("Result: %.2f%n", result);
	            }
	        }

	        sc.close();
	    }
}