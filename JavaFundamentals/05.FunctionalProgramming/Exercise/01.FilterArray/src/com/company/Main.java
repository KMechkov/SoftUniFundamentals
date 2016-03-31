package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] elements = console.nextLine().split("\\W+");
        int numbers = Arrays.stream(elements)
                .filter(x -> x.matches("\\d+"))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(numbers);
    }
}