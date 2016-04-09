package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        int totalStacks = 0;
        int totalBeer = 0;
        String input = console.nextLine();

        while (!input.equals("End")){
            Integer count = Integer.parseInt(input.substring(0,input.indexOf(' ')));
            String  word = input.substring(input.indexOf(' ') +1);
            if (word.equals("stacks")){
                totalStacks += count;
            }
            else {
                totalBeer += count;
            }

            input = console.nextLine();
        }

        int oshteBira = totalBeer / 20;
        totalStacks += oshteBira;
        totalBeer -= oshteBira * 20;
        System.out.printf("%d stacks + %d beers",totalStacks,totalBeer);
    }
}