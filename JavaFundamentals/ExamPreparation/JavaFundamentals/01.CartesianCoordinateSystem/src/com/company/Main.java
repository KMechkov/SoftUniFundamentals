package com.company;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        BigDecimal x = console.nextBigDecimal();
        BigDecimal y = console.nextBigDecimal();

        if (x.compareTo(BigDecimal.ZERO) > 0 && y.compareTo(BigDecimal.ZERO) > 0 ){
            System.out.println(1);
        }
        if (x.compareTo(BigDecimal.ZERO) < 0 && y.compareTo(BigDecimal.ZERO) > 0 ){
            System.out.println(2);
        }
        if (x.compareTo(BigDecimal.ZERO) < 0 && y.compareTo(BigDecimal.ZERO) < 0 ){
            System.out.println(3);
        }
        if (x.compareTo(BigDecimal.ZERO) > 0 && y.compareTo(BigDecimal.ZERO) < 0 ){
            System.out.println(4);
        }
        if (x.compareTo(BigDecimal.ZERO) == 0 && y.compareTo(BigDecimal.ZERO) > 0){
            System.out.println(5);
        }
        if (x.compareTo(BigDecimal.ZERO) == 0 && y.compareTo(BigDecimal.ZERO) < 0){
            System.out.println(5);
        }
        if (x.compareTo(BigDecimal.ZERO) > 0 && y.compareTo(BigDecimal.ZERO) == 0){
            System.out.println(6);
        }
        if (x.compareTo(BigDecimal.ZERO) < 0 && y.compareTo(BigDecimal.ZERO) == 0){
            System.out.println(6);
        }
        if (x.compareTo(BigDecimal.ZERO) == 0 && y.compareTo(BigDecimal.ZERO) == 0){
            System.out.println(0);
        }
    }
}