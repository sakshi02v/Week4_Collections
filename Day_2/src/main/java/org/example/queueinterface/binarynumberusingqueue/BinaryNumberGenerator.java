package org.example.queueinterface.binarynumberusingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class BinaryNumberGenerator {

    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result; // Handle invalid input
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("1"); // Start with "1"

        for (int i = 0; i < n; i++) {
            String current = queue.poll(); // Dequeue
            result.add(current);

            queue.offer(current + "0"); // Enqueue with "0" appended
            queue.offer(current + "1"); // Enqueue with "1" appended
        }

        return result;
    }
}


