package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int n =  console.nextInt();

        int result = 1;
        result =  printFactoriel(n);
        System.out.println(result);

    }

    public static int printFactoriel(int n){
        int result ;
        if (n <= 1){
            return 1;
        }

        result = printFactoriel(n -1) * n;
        return result;
    }
}