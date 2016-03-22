package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double firstResult  = Math.pow(((a*a + b*b)/(a*a-b*b)),((a+b+c)/Math.sqrt(c)));
        double secondResult = Math.pow((a*a+b*b-c*c*c),(a-b));
        double average = ((firstResult + secondResult) / 2) - ((a+b+c)/3);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f ",firstResult,secondResult,average);
    }
}