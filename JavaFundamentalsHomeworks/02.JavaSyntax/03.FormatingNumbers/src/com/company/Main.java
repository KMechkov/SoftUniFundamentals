package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        float b = console.nextFloat();
        float c = console.nextFloat();
        String bitwise = Integer.toString(a,2);
        System.out.printf("|%-10X |%010d|%10.2f|%-10.3f|",a,Integer.parseInt(bitwise),b,c);
    }
}