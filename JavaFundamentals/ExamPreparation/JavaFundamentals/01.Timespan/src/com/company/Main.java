package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        String[] startTime = console.nextLine().split(":");
        String[] endTime = console.nextLine().split(":");
        int hours = Integer.parseInt(startTime[0]) - Integer.parseInt(endTime[0]);
        int minutes = 0;
        int seconds = 0;
        if (Integer.parseInt(startTime[1]) - Integer.parseInt(endTime[1]) < 0){
            hours--;
            minutes = 60 + (Integer.parseInt(startTime[1]) - Integer.parseInt(endTime[1]));
        }
        else{
            minutes = (Integer.parseInt(startTime[1]) - Integer.parseInt(endTime[1]));
        }
        if (Integer.parseInt(startTime[2]) - Integer.parseInt(endTime[2]) < 0){
            minutes--;
            seconds = 60 + (Integer.parseInt(startTime[2]) - Integer.parseInt(endTime[2]));
        }
        else {
            seconds = (Integer.parseInt(startTime[2]) - Integer.parseInt(endTime[2]));
        }
        System.out.printf("%d:%02d:%02d",hours,minutes,seconds);
    }
}