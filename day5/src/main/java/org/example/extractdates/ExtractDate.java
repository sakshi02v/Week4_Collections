package org.example.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void main(String[] args) {
        String regex="\\d{2}/\\d{2}/\\d{4}";
        Pattern pattern=Pattern.compile(regex);
        String input="Inaugration date is on 22/02/2024 and event is on 25/02/2024";
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Date:"+matcher.group());
        }
    }
}
