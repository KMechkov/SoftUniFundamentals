package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        
        int n = Integer.parseInt(console.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n ; i++) {

            numbers[i] = console.nextInt();
        }
        Arrays.sort(numbers);

        for (int number: numbers){
            System.out.print(number + " ");
        }
    }
}