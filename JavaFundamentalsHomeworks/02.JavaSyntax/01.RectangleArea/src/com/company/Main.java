package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String regex = " ";
        String[] sidesOfTheRectangle = console.nextLine().split(" ");

        int a = Integer.parseInt(sidesOfTheRectangle[0]);
        int b = Integer.parseInt(sidesOfTheRectangle[1]);

        System.out.println(a * b);

    }
}
