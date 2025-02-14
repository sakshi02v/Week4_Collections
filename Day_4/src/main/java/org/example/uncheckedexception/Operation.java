package org.example.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator");
            int num1 = sc.nextInt();
            System.out.println("Enter denominator");
            int num2 = sc.nextInt();
            System.out.println("Division result:"+num1 / num2);
        }
            catch(ArithmeticException e){
                System.out.println("Error:division by zero not allowed");
            }
        catch(InputMismatchException e){
            System.out.println("Error:only numeric values allowed");
        }
    }
}
