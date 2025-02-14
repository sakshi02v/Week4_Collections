package org.example.queueinterface.circularbuffersimulation;

class CircularBuffer {

    private int[] buffer;
    private int capacity;
    private int head; // Index for the oldest element
    private int tail; // Index where the next element will be inserted
    private int size; // Number of elements currently in the buffer

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            // Overwrite the oldest element (circular behavior)
            head = (head + 1) % capacity; // Move head forward
        } else {
            size++; // Increment size only if not full
        }

        buffer[tail] = value;
        tail = (tail + 1) % capacity; // Move tail forward (wraps around)

    }

    public Integer dequeue() {
        if (isEmpty()) {
            return null; // Or throw an exception
        }

        int value = buffer[head];
        head = (head + 1) % capacity; // Move head forward
        size--;
        return value;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printBuffer() {
        System.out.print("[");
        if (!isEmpty()) {
            int i = head;
            for (int j = 0; j < size; j++) {
                System.out.print(buffer[i]);
                i = (i + 1) % capacity;
                if (j < size - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");
    }
}
