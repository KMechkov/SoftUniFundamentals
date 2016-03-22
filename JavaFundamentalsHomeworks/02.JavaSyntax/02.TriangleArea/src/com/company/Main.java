package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double side1 =0;
        double side2 =0;
        double side3 =0;

        Scanner console = new Scanner(System.in);

        double sideAx = console.nextDouble();
        double sideAy = console.nextDouble();
        double sideBx = console.nextDouble();
        double sideBy = console.nextDouble();
        double sideCx = console.nextDouble();
        double sideCy = console.nextDouble();

        int area = (int) ((sideAx*(sideBy - sideCy) + sideBx * (sideCy - sideAy) + sideCx*(sideAy - sideBy)) /2);

        if (area < 0){
            System.out.println(-(area));
        }
        else {
            System.out.println(area);
        }
    }
}