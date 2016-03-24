package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split(" ");
        List<String> largestSequence = new ArrayList<>();
        List<String> words = new ArrayList<>();
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < inputLine.length ; i++) {
            if (!words.contains(inputLine[i])){
                for (int j = 0; j < inputLine.length ; j++) {
                    if (inputLine[i].equals(inputLine[j])){
                        count++;
                    }
                }
                if (count > maxCount){
                    maxCount = count;
                    largestSequence.clear();
                    largestSequence.add(inputLine[i]);
                }
                count = 0;
            }
        }
        for (int i = 0; i < maxCount ; i++) {
            System.out.print(largestSequence.get(0) + " ");
        }
    }
}