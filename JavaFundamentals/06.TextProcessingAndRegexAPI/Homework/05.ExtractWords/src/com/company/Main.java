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

        String[] elements = console.nextLine().split("[!-@]");
        List<String> filtredElements = Arrays.stream(elements)
                .filter(x -> x.matches("\\w+"))
                .collect(Collectors.toList());
        filtredElements.forEach(element -> System.out.print(element + " "));
    }
}
