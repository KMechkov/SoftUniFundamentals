package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        Set<Integer> firstSet = new LinkedHashSet<Integer>();
        Set<Integer> secondSet = new LinkedHashSet<Integer>();

        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());

        int min =0;
        int max = 0;

        if (n > m){
            max = n;
            min = m;
        }
        else {
            max = m;
            min = n;
        }

        for (int i =min; i <=max ; i++) {
            firstSet.add(i);
        }

        int rand = 0;

        while (secondSet.size() < firstSet.size()){

            rand = ThreadLocalRandom.current().nextInt(min,max +1);

            if (!secondSet.contains(rand)){
                secondSet.add(rand);
            }
       }
        System.out.print(String.join(" ",secondSet.toString()));
    }
}