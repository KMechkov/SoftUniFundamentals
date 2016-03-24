package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split("\\W+");
        Set<String> allUniqueWords = new TreeSet<>();
        for (int i = 0; i < inputLine.length ; i++) {
            allUniqueWords.add(inputLine[i].toLowerCase());
        }
        for (String word : allUniqueWords){
            System.out.print(word + " ");
        }
    }
}