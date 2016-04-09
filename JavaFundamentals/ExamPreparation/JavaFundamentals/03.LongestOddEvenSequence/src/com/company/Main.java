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

        List<Integer> numbers = new LinkedList<>();
        Pattern pattern = Pattern.compile("-*[0-9]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
        numbers.add(Integer.parseInt(matcher.group(0)));
        }
        boolean even = false;
        boolean odd = false;
        boolean haveZero = false;
        int currentMax = 0;
        int totalMax = 0;
        int nextNumber = 0;
        int currentNumber = 0;

        for (int i = 0; i <numbers.size() -1 ; i++) {
            currentNumber = numbers.get(i);
            nextNumber = numbers.get(i +1);

            if (currentMax == 0 ){

                if (currentNumber % 2 == 0){
                    even = true;
                }
                else {
                    odd = true;
                }
                currentMax++;
            }

            if ( nextNumber == 0 ){
                currentMax++;
                if (even){
                    even = false;
                    odd = true;
                }
                else {
                    even = true;
                    odd = false;
                }
            }
            else if (even == true){
                if (nextNumber % 2 != 0){
                    currentMax++;
                    even = false;
                    odd = true;
                }
                else {
                    if (currentMax > totalMax){
                        totalMax = currentMax;
                    }
                    even = false;
                    odd = false;
                    currentMax = 0;
                }
            }
            else if (odd == true){
                if (nextNumber % 2 == 0){
                    currentMax++;
                    even = true;
                    odd = false;
                }
                else {
                    if (currentMax > totalMax){
                        totalMax = currentMax;
                    }
                    even = false;
                    odd = false;
                    currentMax = 0;
                }
            }
        }
        if (currentMax > totalMax){
            System.out.println(currentMax);
        }
        else {
            System.out.println(totalMax);
        }
    }
}