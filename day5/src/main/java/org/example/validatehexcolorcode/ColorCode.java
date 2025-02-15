package org.example.validatehexcolorcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCode {
    public static void main(String[] args) {

        String regex="^#[A-fa-f0-9]{6}$";
        Pattern pattern=Pattern.compile(regex);
        String input="#abf567";
        Matcher matcher=pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid:"+matcher.group());
        }
        else{
            System.out.println("Invalid");
        }
    }
}
