package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
       int result = 0;

        char[] charcheta = console.nextLine().toCharArray();

        int[] reverse = new int[charcheta.length];

        for (int i = charcheta.length -1,j =0; i >=0 ; i--,j++) {

            reverse[j] = Integer.parseInt(String.valueOf(charcheta[i]));
        }

        for (int i = 0; i < reverse.length ; i++) {

            int sum = (int) (reverse[i] *Math.pow(7,i));

            result += sum;
        }
        System.out.println(result);
    }
}