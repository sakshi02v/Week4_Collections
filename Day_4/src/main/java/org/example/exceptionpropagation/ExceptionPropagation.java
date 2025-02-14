package org.example.exceptionpropagation;

public class ExceptionPropagation {
    public static void method1() {
        // This will cause ArithmeticException (division by zero)
        int result = 10 / 0;
        System.out.println("Result: " + result); // This line won't execute
    }

    public static void method2() {
        method1(); // Calls method1(), exception propagates from here
    }

    public static void main(String[] args) {
        try {
            method2(); // Calls method2(), exception propagates up
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main.");
        }
    }
}

