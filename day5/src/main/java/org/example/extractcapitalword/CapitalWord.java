package org.example.extractcapitalword;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalWord {
    public static void main(String[] args) {
        String regex="[A-Z][a-z]{1,}";
        Pattern pattern=Pattern.compile(regex);
        String input="Eiffel Tower is in Paris";
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Matched:"+matcher.group());
        }
    }
}
