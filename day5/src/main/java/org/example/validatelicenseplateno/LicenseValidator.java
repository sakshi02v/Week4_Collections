package org.example.validatelicenseplateno;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicenseValidator {
    public static void main(String[] args) {
        String regex="^[A-Z]{2}[0-9_]{4}$";
        Pattern pattern=Pattern.compile(regex);
        String input="AB1234";
        Matcher matcher=pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid:"+matcher.group());
        }
        else{
            System.out.println("Invalid");
        }
    }
}
