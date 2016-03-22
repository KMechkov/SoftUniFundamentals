package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String text = console.nextLine();

        Pattern pattern = Pattern.compile("([a-zA-z]+)");
        Matcher matcher =  pattern.matcher(text);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}