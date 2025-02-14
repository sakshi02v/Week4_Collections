package org.example.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCheck {
    public static void main(String[] args) {
        String filename = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_4\\src\\main\\java\\org\\example\\checkedexception\\file";
        try(BufferedReader reader=new BufferedReader(new FileReader(filename))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Error during file reading");
        }
    }
}
