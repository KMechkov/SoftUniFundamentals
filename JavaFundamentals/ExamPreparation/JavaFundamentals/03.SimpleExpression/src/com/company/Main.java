package com.company;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        char[] inputLine = console.nextLine().trim().toCharArray();
        String number = "";
        List<String> input = new LinkedList<>();
        for (int i = 0; i < inputLine.length; i++) {
            if (inputLine[i] != ' ') {
                if (inputLine[i]!= '+' && inputLine[i] != '-'){
                    number += Character.toString(inputLine[i]);
                }
                else {
                    input.add(number);
                    input.add(Character.toString(inputLine[i]));
                    number = "";
                }
            }
        }
        input.add(number);
        BigDecimal sum = new BigDecimal("0.0");
        BigDecimal currentNumber = new BigDecimal(input.get(0));

       sum = sum.add(currentNumber);
        for (int i = 1; i < input.size()-1 ; i++) {

            currentNumber = new BigDecimal(input.get(i+1));
            if (input.get(i).equals("+")){
                sum = sum.add(currentNumber);
                i++;
            }
            else {
               sum = sum.subtract(currentNumber);
                i++;
            }
        }
        System.out.println(sum);
    }
}