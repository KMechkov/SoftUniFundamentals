package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        int totalHours = 0;
        int totalMinutes = 0;
        String input = console.nextLine();

        while (!input.equals("End")){

            int currentHours = Integer.parseInt(input.substring(0,input.indexOf(':')));
            int currentMinutes = Integer.parseInt(input.substring(input.indexOf(':')+1));

            totalHours += currentHours;
            totalMinutes += currentMinutes;

            input = console.nextLine();
        }
        totalHours+= totalMinutes / 60;
        totalMinutes -= (totalMinutes / 60) * 60;
        if (totalMinutes < 10){
            System.out.println(totalHours + ":0" + totalMinutes);
        }
        else {
            System.out.println(totalHours + ":" + totalMinutes);
        }
    }
}