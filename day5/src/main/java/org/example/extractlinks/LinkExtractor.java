package org.example.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        String regex="[a-z]{4,}://[a-z]{2,}[a-z.]{2,}";
        Pattern pattern=Pattern.compile(regex);
        String input="Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Link:"+matcher.group());
        }
    }
}

