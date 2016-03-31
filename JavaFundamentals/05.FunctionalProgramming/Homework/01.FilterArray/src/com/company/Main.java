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

        String[] elements = console.nextLine().split("\\W+");
        List<String> filtredList = Arrays.stream(elements)
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList());
        filtredList.forEach(item -> System.out.print(item + " "));
    }
}