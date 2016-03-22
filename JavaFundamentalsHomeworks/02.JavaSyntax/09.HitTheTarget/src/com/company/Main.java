package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int num = console.nextInt();

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                if (i + j == num){
                    System.out.printf("%d + %d = %d",i,j,num);
                    System.out.println();
                }
            }
        }
        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                if (i -j == num){
                    System.out.printf("%d - %d = %d",i,j,num);
                    System.out.println();
                }
            }   
        }
    }
}