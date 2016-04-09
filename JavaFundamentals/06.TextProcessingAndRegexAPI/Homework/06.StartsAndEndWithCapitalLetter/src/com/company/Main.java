package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split(" ");

        List<String> words = Arrays.stream(inputLine)
                .filter(x -> x.matches("\\b[A-Z][a-zA-Z]*[A-Z]\\b|\\b[A-Z]\\b"))
                .collect(Collectors.toList());
        words.forEach(word -> System.out.print(word + " "));
    }
}
