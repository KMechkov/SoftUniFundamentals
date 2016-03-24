package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split("\\W+");
        Map<String,Double> cards = new LinkedHashMap<>();

        for (int i = 0; i < inputLine.length ; i++) {
            if (!cards.containsKey(inputLine[i])){
                cards.put(inputLine[i],1.00);
            }
            else {

                cards.put(inputLine[i],cards.get(inputLine[i])+1);
            }
        }
        for (Map.Entry<String,Double> entry : cards.entrySet()){

            System.out.printf("%s -> %.2f",entry.getKey(),(entry.getValue() * 100)/inputLine.length);
            System.out.print("%");
            System.out.println();
        }
    }
}