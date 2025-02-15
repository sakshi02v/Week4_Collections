package org.example.validateusername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
    public static void main(String[] args) {
        String regex="^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern= Pattern.compile(regex);
        String input="Sakshi02v_123";
        Matcher matcher=pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid:"+matcher.group());
        }
        else{
            System.out.println("Invalid");
        }
    }
}
