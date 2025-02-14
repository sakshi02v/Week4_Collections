package org.example.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50}; // Sample array

        try {
            // Taking user input for index and divisor
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();

            try {
                int element = numbers[index]; // May throw ArrayIndexOutOfBoundsException
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                try {
                    int result = element / divisor; // May throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            System.out.println("Operation completed.");
            scanner.close(); // Closing scanner
        }
    }
}
