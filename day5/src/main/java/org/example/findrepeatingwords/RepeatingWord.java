package org.example.findrepeatingwords;

import java.util.*;
import java.util.regex.*;

public class RepeatingWord {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        List<String> repeatingWords = findRepeatingWords(text);
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));
    }

    public static List<String> findRepeatingWords(String text) {
        String regex = "\\b(\\w+)\\b"; // Match individual words
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> wordCount = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group().toLowerCase(); // Convert to lowercase for case-insensitive matching
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> repeatingWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        return repeatingWords;
    }
}

