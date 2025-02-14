package org.example.multiplecatchblocks;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[4];
            System.out.println("Enter array elements:");
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter index of element to be retrieved:");
            int indexno = sc.nextInt();
            System.out.println("Value at index"+indexno+":"+arr[indexno]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Invalid index");
        }
        catch(NullPointerException e){
            System.out.println("Error: Array is not initialized!");
        }
    }
}
