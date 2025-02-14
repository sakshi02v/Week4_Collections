package org.example.readlargefile;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\readlargefile\\examplefile.txt";
        readLargeFile(filePath);
    }

    private static void readLargeFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
