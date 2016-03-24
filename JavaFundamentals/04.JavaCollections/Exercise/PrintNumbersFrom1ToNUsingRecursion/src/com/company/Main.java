package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        printRecursive(n);

    }
    public static void printRecursive(int n){
        if (n < 1){
            return;
        }
        printRecursive(n -1);

        System.out.println(n);
    }
}
