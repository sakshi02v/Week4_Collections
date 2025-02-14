package org.example.queueinterface.stackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

class StackImplementation {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.offer(x); // Enqueue to q2

        // Move elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public Integer pop() {
        if (q1.isEmpty()) {
            return null; // Or throw an exception
        }
        return q1.poll();
    }

    public Integer top() {
        if (q1.isEmpty()) {
            return null; // Or throw an exception
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
