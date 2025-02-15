package org.example.extractemailaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
    public static void main(String[] args) {
        String regex="[A-Za-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        String input="This is my email address : sakshi02v@gmail.com";
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Email:"+matcher.group());
        }
    }
}
