package org.example.filterstreams;

import java.io.*;

public class Conversion {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\uppercasetolowercase\\inputfile";
        String outputFile = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\uppercasetolowercase\\outputfile"; // Converted text will be stored here

        convertUppercaseToLowercase(inputFile, outputFile);
    }

    private static void convertUppercaseToLowercase(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase and write
                writer.newLine(); // Preserve original line breaks
            }

            System.out.println("Text converted successfully. Check " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
