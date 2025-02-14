package org.example.pipedstreams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes()); // Writing byte data
            pos.close(); // Close the stream after writing
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = pis.read()) != -1) {
                System.out.print((char) data); // Reading and printing byte-by-byte
            }
            pis.close();
            System.out.println("\nReader finished reading.");
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}


