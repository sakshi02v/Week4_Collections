package org.example.readuserinputfromconsole;

import java.io.*;

public class UserInput {
    public static void main(String[] args) {
        // File to store user data
        String outputFile = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\readuserinputfromconsole\\outputfiles";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(outputFile, true)) { // Append mode enabled

            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("------------------------\n"); // Separator for multiple entries

            System.out.println("User data saved successfully in " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
