package org.example.datastreams;

import java.io.*;

public class StudentDataStream {
    private static final String FILE_NAME = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\datastreams\\studentsdata"; // Binary file to store student details

    public static void main(String[] args) {
        // Writing student data to file
        writeStudentData();

        // Reading student data from file
        readStudentData();
    }

    // Method to write student details to a binary file
    private static void writeStudentData() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            // Writing 3 student records
            dos.writeInt(101); // Roll Number
            dos.writeUTF("Alice"); // Name
            dos.writeDouble(3.8); // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);

            System.out.println("Student details successfully written to " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read student details from a binary file
    private static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("\nReading Student Details from " + FILE_NAME + ":\n");

            while (dis.available() > 0) { // Read until end of file
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
