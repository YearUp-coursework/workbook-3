package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = null;

        try{
            fis = new FileInputStream("jokes.txt");
            Scanner fileScanner = new Scanner(fis);

            String currentLine;

            while(fileScanner.hasNextLine()){
                currentLine = fileScanner.nextLine();
                System.out.println(currentLine);
            }

            fileScanner.close();
        }catch (FileNotFoundException e){
            System.out.println("There was an error with the file");
            e.printStackTrace();
        }

        System.out.println("Done");



    }
}