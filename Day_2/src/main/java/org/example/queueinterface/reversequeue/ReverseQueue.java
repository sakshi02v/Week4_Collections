package org.example.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        if (queue == null || queue.isEmpty()) {
            return queue; // Nothing to reverse
        }

        Stack<T> stack = new Stack<>();

        // 1. Dequeue elements from the queue and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // 2. Pop elements from the stack and enqueue them back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}
