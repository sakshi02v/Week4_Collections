package org.example.extractingcurrency;

import java.util.regex.*;
import java.util.*;

public class CurrencyExtract {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Define regex pattern to match currency values (with or without $)
        String regex = "\\$?\\d+\\.\\d{2}";

        // Compile regex and find matches
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Currency:"+matcher.group());
        }
    }
}

