package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());

        GetAverage(a,b,c);
    }
    public static void GetAverage(double a,double b,double c){

        double result = (a+b+c) / 3;
        System.out.printf("%.2f",result);
    }
}
