package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        int currentMax = 0;
        int a = 0;
        int a1 = 0;
        int b = 0;
        int b1= 0;
        int c= 0;
        int c1 = 0;

        List<Integer> numbers = new LinkedList<>();

        Pattern patte = Pattern.compile("[0-9]+");
        Matcher match = patte.matcher(input);

        while (match.find()){
            numbers.add(Integer.parseInt(match.group(0)));
        }
        for (int i = 0; i < numbers.size()-5; i+=2) {
            a = numbers.get(i);
            a1 = numbers.get(i +1);
            b = numbers.get(i +2);
            b1 = numbers.get(i +3);
            c = numbers.get(i +4);
            c1 = numbers.get(i +5);
            if ((a * a1) + (b * b1) + (c * c1) > currentMax){
                currentMax = (a * a1) + (b * b1) + (c * c1);
            }
        }
        System.out.println(currentMax);
    }
}