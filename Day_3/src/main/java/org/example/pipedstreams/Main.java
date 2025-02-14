package org.example.pipedstreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect input to output

            // Creating and starting threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

        } catch (IOException e) {
            System.out.println("Error connecting pipes: " + e.getMessage());
        }
    }
}

