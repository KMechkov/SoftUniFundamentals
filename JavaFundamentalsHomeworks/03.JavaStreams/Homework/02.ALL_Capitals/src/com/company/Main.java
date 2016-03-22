package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        final String SAVE_PATH = "C:/Users/kriss/IdeaProjects/JavaStreams/Homework/02.ALL_Capitals/lines.txt";
        File file = new File(SAVE_PATH);
        ArrayList<String> items = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();
        while (line != null){

            items.add(line.toUpperCase());
            line = reader.readLine();
        }

        FileWriter fw = new FileWriter(file);
        PrintWriter writer = new PrintWriter(fw);

        for (String item:items){
            writer.println(item);
            writer.flush();
        }
    }
}