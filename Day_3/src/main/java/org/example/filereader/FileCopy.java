package org.example.filereader;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\filereader\\examplefile.txt";
        String destinationFile = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\filereader\\destination";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File src = new File(sourceFile);

            // Check if the source file exists
            if (!src.exists()) {
                System.out.println("Source file does not exist!");
                return;
            }

            fis = new FileInputStream(src);
            fos = new FileOutputStream(destinationFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
                    System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}