package org.example.mapinterface.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequencies(String filename) throws IOException {
        Map<String, Integer> wordFrequencies = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", ""); // Keep only alphanumeric and spaces

                String[] words = line.split("\\s+"); // Split by any whitespace

                for (String word : words) {
                    if (!word.isEmpty()) { // Skip empty strings
                        wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }

        return wordFrequencies;
    }
}
