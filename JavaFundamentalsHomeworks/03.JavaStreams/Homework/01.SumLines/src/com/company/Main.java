package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final String SAVE_PATH = "D:/SoftUni/Java Fundamentals/03.JavaStreams/lines.txt";
        File file = new File(SAVE_PATH);

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null){
            int result = 0;
            for (int i = 0; i < line.length() ; i++) {

                result += line.charAt(i);
            }
            System.out.println(result);
            line = reader.readLine();
        }
    }
}