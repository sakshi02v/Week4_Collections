package org.example.queueinterface.binarynumberusingqueue;

import java.util.List;

import static org.example.queueinterface.binarynumberusingqueue.BinaryNumberGenerator.generateBinaryNumbers;

public class Main{
    public static void main(String[] args) {
        int n = 5;
        List<String> binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Binary numbers for n=" + n + ": " + binaryNumbers); // Output: [1, 10, 11, 100, 101]

        n = 10;
        binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Binary numbers for n=" + n + ": " + binaryNumbers); // Output: [1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010]

        n = 0;
        binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Binary numbers for n=" + n + ": " + binaryNumbers); // Output: []

        n = -5;
        binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Binary numbers for n=" + n + ": " + binaryNumbers); // Output: []

    }
}

