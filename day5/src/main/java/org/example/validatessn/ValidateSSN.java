package org.example.validatessn;

import java.util.regex.*;

public class ValidateSSN {

    public static void main(String[] args) {
        //SSN format: XXX-XX-XXXX (Only digits, must follow this pattern)
        String SSN_REGEX = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(SSN_REGEX);
        String ssn1 = "123-45-6789";

        Matcher matcher=pattern.matcher(ssn1);
        if(matcher.matches()){
            System.out.println("Valid SSN:"+matcher.group());
        }
        else{
            System.out.println("Invalid");
        }
    }
}

