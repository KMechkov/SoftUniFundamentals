package com.company;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] elements = console.nextLine().toLowerCase().split("\\W+");
        String specifiedWord = console.nextLine();

        List<String> words = Arrays.stream(elements)
                .filter(x -> x.matches(specifiedWord))
                .collect(Collectors.toList());
        System.out.println(words.size());
    }
}