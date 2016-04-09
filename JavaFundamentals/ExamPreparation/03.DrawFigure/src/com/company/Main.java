package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int stars = n;
        int dots = 0;

        for (int i = 0; i < n ; i++) {
            if (stars <= 0){
                break;
            }
            for (int j = 0; j < dots ; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < stars ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < dots ; j++) {
                System.out.print(".");
            }
            stars-=2;
            dots++;
            System.out.println();
        }
        dots-=2;
        stars += 4;
        for (int i = 0; i < n; i++) {
            if (stars > n){
                break;
            }
            for (int j = 0; j < dots ; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < stars ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < dots ; j++) {
                System.out.print(".");
            }
            dots--;
            stars+=2;
            System.out.println();
        }
    }
}