package com.company;

import sun.java2d.pipe.BufferedRenderPipe;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        final String FILE_PATH = "D:/SoftUni/Java Fundamentals/03.JavaStreams/users.txt";
        final String SAVE_PATH = "D:/SoftUni/Java Fundamentals/03.JavaStreams/total-time.txt";

        File file = new File(FILE_PATH);
        File outputFile = new File(SAVE_PATH);

        FileWriter fw = new FileWriter(outputFile,true);
        PrintWriter writer = new PrintWriter(fw, true);



        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        while (line != null){

            String[] lineArgs = line.split(" ");
            String username = lineArgs[0];
            int totalMinutes = 0;
            int hours = 0;
            int minutes = 0;
            int days = 0;

            for (int i = 1; i <lineArgs.length ; i++) {
                String[] loggedTime =  lineArgs[i].split(":");
                hours = Integer.parseInt(loggedTime[0]);
                minutes = Integer.parseInt(loggedTime[1]);
                totalMinutes += (hours * 60) + minutes;
                days = totalMinutes / 1440;


            }

            minutes = totalMinutes;
            days = minutes/1440;
            minutes -= days * 1440;
            hours = minutes / 60 ;
            minutes -= hours *60;

            StringBuilder sb = new StringBuilder();
            sb.append(username + " " + totalMinutes + "(" +
            days + " days, " + hours + " hours, " + minutes + " minutes)");

            writer.println(sb.toString());
            line = reader.readLine();
        }
        writer.close();
        reader.close();
    }
}