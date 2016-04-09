package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int lines = Integer.parseInt(console.nextLine());
        int[] numbers = new int[lines];
        boolean haveNumbers = false;
        boolean haveZero = false;
        for (int i = 0; i < lines ; i++) {
            numbers[i] = Integer.parseInt(console.nextLine());
        }

        int a = 0 ;
        int b = 0;
        int c = 0;
        for (int i = 0; i < numbers.length ; i++) {
            a = numbers[i];
            for (int j = 0; j < numbers.length ; j++) {
                if (numbers[j] > numbers[i]){
                    b = numbers[j];
                }
                else {
                    b = 0;
                }
                for (int k = 0; k < numbers.length ; k++) {
                    c = numbers[k];

                    if (a == 0 && b == 0 && !haveZero){
                        System.out.printf("%d*%d + %d*%d = %d*%d",a,a,b,b,b,b);
                        System.out.println();
                        haveNumbers = true;
                        haveZero = true;
                    }
                    if ((a * a) + (b * b) == c * c && b > a){
                        System.out.printf("%d*%d + %d*%d = %d*%d",a,a,b,b,c,c);
                        System.out.println();
                        haveNumbers = true;
                    }
                }
            }
        }
        if (!haveNumbers){
            System.out.println("No");
        }
    }
}