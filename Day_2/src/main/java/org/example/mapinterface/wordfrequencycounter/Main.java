package org.example.mapinterface.wordfrequencycounter;

import java.io.IOException;
import java.util.Map;

import static org.example.mapinterface.wordfrequencycounter.WordFrequencyCounter.countWordFrequencies;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java WordFrequencyCounter <filename>");
            System.exit(1);
        }

        String filename = args[0];

        try {
            Map<String, Integer> frequencies = countWordFrequencies(filename);
            System.out.println(frequencies);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
    }
}