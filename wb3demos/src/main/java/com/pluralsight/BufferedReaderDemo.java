package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args){

        FileReader fr = null;
        try {
            fr = new FileReader("jokes.txt");
            BufferedReader br = new BufferedReader(fr);
            String currentLine;

            while ((currentLine = br.readLine()) != null){
                System.out.println(currentLine);
            }

            br.close();

        } catch (Exception e){
            throw new RuntimeException(e);

        }
    }
}
