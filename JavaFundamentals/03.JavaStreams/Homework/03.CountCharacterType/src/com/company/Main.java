package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        final String SAVE_PATH = "C:/Users/kriss/IdeaProjects/JavaStreams/Homework/03.CountCharacterType/src/words.txt";
        final String Output = "C:/Users/kriss/IdeaProjects/JavaStreams/Homework/03.CountCharacterType/src/count-chars.txt";
        File file = new File(SAVE_PATH);

        ArrayList<Character> vowlesList = new ArrayList<>();
        vowlesList.add('a');
        vowlesList.add('e');
        vowlesList.add('i');
        vowlesList.add('o');
        vowlesList.add('u');
         ArrayList<Character> punctionsList = new ArrayList<>();
        punctionsList.add('!');
        punctionsList.add('?');
        punctionsList.add('.');
        punctionsList.add(',');

        int vowles = 0;
        int consonants = 0;
        int punctions = 0;


        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine().toLowerCase();

        for (int i = 0; i < line.length(); i++) {

            char checkIfExist = line.charAt(i);

            if (vowlesList.contains(checkIfExist)) {
                vowles++;

            } else if (punctionsList.contains(checkIfExist)) {
                punctions++;

            } else if (checkIfExist == ' '){
                continue;
            }
            else {
                consonants++;
            }
            System.out.println(vowles + " " + punctions + " " + consonants);
        }

        File outputFile = new File(Output);
        FileWriter fw = new FileWriter(outputFile);
        PrintWriter writer = new PrintWriter(fw);
        writer.println("Vowles: " + vowles);
        writer.println("Consonants: " + consonants);
        writer.println("Punction: " + punctions);
        writer.flush();
    }
}