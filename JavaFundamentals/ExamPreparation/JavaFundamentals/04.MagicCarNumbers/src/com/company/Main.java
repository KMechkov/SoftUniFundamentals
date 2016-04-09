package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();
        int count = 0;
        int CA = 40;



        for (int a = 0; a <= 9 ; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9 ; c++) {
                    for (int d = 0; d <=9 ; d++) {
                        for (int first = 10; first <= 240; first += 10) {
                            if (first == 40 || first == 120) {
                                first += 10;
                            }
                            if (first == 60 || first == 90 || first == 140) {
                                first += 20;
                            }
                            if (first == 170 || first == 210) {
                                first += 30;
                            }
                            for (int second = 10; second <= 240; second += 10) {
                                if (second == 40 || second == 120) {
                                    second += 10;
                                }
                                if (second == 60 || second == 90 || second == 140) {
                                    second += 20;
                                }
                                if (second == 170 || second == 210) {
                                    second += 30;
                                }

                                if (CA + a + b +c +d + first + second == number)
                                {

                                    if (a == b && a == c && a == d ){
                                            count++;
                                    }
                                    else if(a != b && b ==c && b ==d){
                                        count++;
                                    }
                                    else if (a ==b && a ==c && a != d){
                                        count++;
                                    }
                                    else if (a==b && c ==d && a != c){
                                        count++;
                                    }
                                    else if(a != b && a==c && b ==d){
                                        count++;
                                    }
                                    else if(a != b && a == d && b ==c){
                                        count++;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        System.out.println(count);
    }
}