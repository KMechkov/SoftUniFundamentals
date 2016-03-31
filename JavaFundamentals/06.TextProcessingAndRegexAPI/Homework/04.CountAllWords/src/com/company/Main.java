package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        String[] elements = console.nextLine().split("\\W+");
        System.out.println(elements.length);
    }
}