package org.example.extractprogramminglangname;

import java.util.regex.*;
import java.util.*;

public class ProgammingName {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Define regex pattern to match programming language names
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C|Ruby|Swift|Kotlin|Rust|PHP|TypeScript|C#)\\b";

        // Compile regex and find matches
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Matched:"+matcher.group());
        }


    }
}
