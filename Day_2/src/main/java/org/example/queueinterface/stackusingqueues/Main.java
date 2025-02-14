package org.example.queueinterface.stackusingqueues;

public class Main{

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Top element: " + stack.top());    // Output: 2
        System.out.println("Is empty: " + stack.isEmpty()); // Output: false
        stack.pop();//2
        stack.pop();//1
        System.out.println("Is empty: " + stack.isEmpty()); // Output: true

    }
}

