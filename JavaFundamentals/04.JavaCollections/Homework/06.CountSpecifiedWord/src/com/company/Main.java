package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split("\\W+");
        String specifiedWord = console.nextLine();
        int count = 0;

        for (int i = 0; i < inputLine.length ; i++) {
            if (inputLine[i].toLowerCase().equals(specifiedWord)){
                count++;
            }
        }
        System.out.println(count);
    }
}