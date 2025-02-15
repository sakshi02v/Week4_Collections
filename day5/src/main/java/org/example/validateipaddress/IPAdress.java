package org.example.validateipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdress{

    public static void main(String[] args) {
        String regex =
                "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                        "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                        "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                        "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        Pattern pattern=Pattern.compile(regex);
        String ip = "192.168.1.1";
        Matcher matcher=pattern.matcher(ip);
        if (matcher.matches()) {
            System.out.println("Valid IP: " + ip);
        } else {
            System.out.println("Invalid IP");
        }
    }
}

