package com.company;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        BigInteger a = console.nextBigInteger();
        BigInteger b = console.nextBigInteger();
        BigInteger c = console.nextBigInteger();
        int N = console.nextInt();
        BigInteger nextC  = new BigInteger(String.valueOf(0));

        if (N == 1){
            System.out.println(a);
        }
        if (N == 2){
            System.out.println(b);
        }
        if (N == 3){
            System.out.println(c);
        }
        for (int i = 0; i < N - 3 ; i++) {

            nextC  = new BigInteger(String.valueOf(0));
            nextC = nextC.add(a);
            nextC = nextC.add(b);
            nextC = nextC.add(c);
            a = b;
            b = c;
            c = nextC;
        }
        if (N > 3){
            System.out.println(nextC);
        }
    }
}