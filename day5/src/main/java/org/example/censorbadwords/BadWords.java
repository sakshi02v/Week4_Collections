package org.example.censorbadwords;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class BadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Create a regex pattern for bad words (case-insensitive)
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Replace each bad word with "****"
        String censored = pattern.matcher(input).replaceAll("****");

        // Output the censored sentence
        System.out.println(censored);
    }
}

