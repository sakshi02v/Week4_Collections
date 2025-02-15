package org.example.replacemodifystring;

public class StringModify {
    public static void main(String[] args) {
        String text="this text     contains     many   spaces  ";
        String replacedSpaces=text.replaceAll("\\s+"," ");
        System.out.println("Text with spaces:"+text);
        System.out.println("Formatted:"+replacedSpaces);
    }
}
