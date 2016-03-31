package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int sum = 0 ;
        for (int i = 0; i < 7 ; i++) {
            String[] input = console.nextLine().split(" ");
            if (input[1].equals("eggs")){
                sum += Integer.parseInt(input[0]);
            }
            if (input[1].equals("dozens")){
                sum += (Integer.parseInt(input[0])) * 12;
            }
        }
        int dozens = sum/12;
        int eggs = sum -(dozens * 12);
        System.out.printf("%d dozens + %d eggs",dozens,eggs);
    }
}