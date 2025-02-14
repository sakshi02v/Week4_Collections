package org.example.queueinterface.circularbuffersimulation;

public class Main {

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        System.out.print("Buffer after inserting 1, 2, 3: ");
        buffer.printBuffer(); // Output: [1, 2, 3]

        buffer.enqueue(4); // Overwrite the oldest element (1)
        System.out.print("Buffer after inserting 4: ");
        buffer.printBuffer(); // Output: [2, 3, 4]

        buffer.enqueue(5);
        System.out.print("Buffer after inserting 5: ");
        buffer.printBuffer(); // Output: [3, 4, 5]

        System.out.println("Dequeued element: " + buffer.dequeue()); // Output: 3
        System.out.print("Buffer after dequeue: ");
        buffer.printBuffer();// Output: [4, 5]

        buffer.enqueue(6);
        System.out.print("Buffer after inserting 6: ");
        buffer.printBuffer(); // Output: [4, 5, 6]

        buffer.enqueue(7);
        System.out.print("Buffer after inserting 7: ");
        buffer.printBuffer(); // Output: [5, 6, 7]

    }
}
