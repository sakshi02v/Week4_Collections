package org.example.bytearraystream;

import java.io.*;

public class ImageByteArrayConverter {
    public static void main(String[] args) {
        String sourceImage = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\bytearraystream\\gannu.jpg";
        String outputImage = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\bytearraystream\\output.jpg";

        // Convert image to byte array
        byte[] imageBytes = convertImageToByteArray(sourceImage);
        if (imageBytes == null) {
            System.out.println("Failed to read the image.");
            return;
        }

        // Write byte array back to image
        boolean success = writeByteArrayToImage(imageBytes, outputImage);
        if (success) {
            System.out.println("Image successfully reconstructed as " + outputImage);

            // Verify file sizes
            compareFileSizes(sourceImage, outputImage);
        }
    }

    // Method to convert an image to a byte array
    private static byte[] convertImageToByteArray(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();

        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
            return null;
        }
    }

    // Method to write byte array back to an image file
    private static boolean writeByteArrayToImage(byte[] imageBytes, String outputFilePath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            return true;

        } catch (IOException e) {
            System.out.println("Error writing image: " + e.getMessage());
            return false;
        }
    }

    // Method to compare the sizes of the original and copied image
    private static void compareFileSizes(String originalFile, String copiedFile) {
        File file1 = new File(originalFile);
        File file2 = new File(copiedFile);

        if (file1.exists() && file2.exists()) {
            System.out.println("Original Image Size: " + file1.length() + " bytes");
            System.out.println("Copied Image Size: " + file2.length() + " bytes");

            if (file1.length() == file2.length()) {
                System.out.println("✅ The copied image is identical in size to the original.");
            } else {
                System.out.println("⚠ The copied image size differs from the original.");
            }
        } else {
            System.out.println("Error: One of the files does not exist.");
        }
    }
}

