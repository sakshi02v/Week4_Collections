package org.example.trywithresources;


import java.io.*;

public class FirstLine {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_4\\src\\main\\java\\org\\example\\trywithresources\\text";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}


