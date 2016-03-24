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
        List<String> words = new ArrayList<>();

        for (int i = 0; i < inputLine.length; i++) {
            if (!words.contains(inputLine[i])){
                words.add(inputLine[i]);
                for (int j = 0; j < inputLine.length ; j++) {
                    if (inputLine[i].equals(inputLine[j])){
                        System.out.print(inputLine[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}