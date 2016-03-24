package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] firstInput = console.nextLine().split(" ");
        String[] secondInput = console.nextLine().split(" ");

        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();


        for (int i = 0; i < firstInput.length ; i++) {
          firstList.add(firstInput[i]);
        }

        for (int i = 0; i < secondInput.length ; i++) {

            if (!firstList.contains(secondInput[i])){
                secondList.add(secondInput[i]);
            }
        }
        for (int i = 0; i < secondList.size() ; i++) {
            firstList.add(secondList.get(i));
        }

       for (String item : firstList){
           System.out.print(item + " ");
       }
    }
}