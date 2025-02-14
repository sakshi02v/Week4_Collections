package org.example.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

import static org.example.queueinterface.reversequeue.ReverseQueue.reverseQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        Queue<Integer> reversedQueue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + reversedQueue); // Output: [30, 20, 10]

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("A");
        stringQueue.add("B");
        stringQueue.add("C");

        System.out.println("Original String Queue: " + stringQueue);
        Queue<String> reversedStringQueue = reverseQueue(stringQueue);
        System.out.println("Reversed String Queue: " + reversedStringQueue); // Output: [C, B, A]

        Queue<Integer> emptyQueue = new LinkedList<>();
        System.out.println("Original Empty Queue: " + emptyQueue);
        Queue<Integer> reversedEmptyQueue = reverseQueue(emptyQueue);
        System.out.println("Reversed Empty Queue: " + reversedEmptyQueue); // Output: [] (no change)

        Queue<Integer> nullQueue = null;
        System.out.println("Original Null Queue: " + nullQueue);
        Queue<Integer> reversedNullQueue = reverseQueue(nullQueue);
        System.out.println("Reversed Null Queue: " + reversedNullQueue); // Output: null (no change)


    }
}
