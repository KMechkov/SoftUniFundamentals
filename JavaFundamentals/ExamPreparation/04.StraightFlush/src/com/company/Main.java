package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().toUpperCase().split("[,]*\\s+");
        Map<Integer,String> cards = new TreeMap<>();
        boolean haveStraighFlush = false;

        for (int i = 0; i < input.length ; i++) {

            Integer lastCardCifra = 0;

            String bukva = input[i].substring(0,input[i].length() -1);
            if (bukva.equals("J")){
                lastCardCifra = 11;
            }
            else if (bukva.equals("Q")){
                lastCardCifra = 12;
            }
            else if (bukva.equals("K")){
                lastCardCifra = 13;
            }
            else if (bukva.equals("A")){
                lastCardCifra = 14;
            }
            else {
                lastCardCifra = Integer.parseInt(bukva);
            }
            String lastCardBoq = input[i].substring(input[i].length() -1) ;
            List<String> straightFlush = new LinkedList<>();
            straightFlush.add(lastCardCifra + lastCardBoq);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < input.length ; k++) {

                    Integer currentCardCifra = 0;
                    bukva = input[k].substring(0,input[k].length() -1);
                    if (bukva.equals("J")){
                        currentCardCifra = 11;
                    }
                    else if (bukva.equals("Q")){
                        currentCardCifra = 12;
                    }
                    else if (bukva.equals("K")){
                        currentCardCifra = 13;
                    }
                    else if (bukva.equals("A")){
                        currentCardCifra = 14;
                    }
                    else {
                        currentCardCifra = Integer.parseInt(bukva);
                    }

                    String currentCardBoq = input[k].substring(input[k].length() -1);

                    if (lastCardBoq.equals(currentCardBoq) && currentCardCifra - lastCardCifra == 1){
                        lastCardBoq = currentCardBoq;
                        lastCardCifra = currentCardCifra;
                        if (straightFlush.size() < 5){
                            straightFlush.add(bukva + currentCardBoq);
                        }
                    }
                }
            }
            if (straightFlush.size() == 5){
                System.out.print("[");
                System.out.print(String.join(", ",straightFlush));
                System.out.println("]");
                haveStraighFlush = true;
            }
        }
        if (!haveStraighFlush){
            System.out.println("No Straight Flushes");
        }
    }
}