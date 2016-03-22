package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        char[] twoString = console.nextLine().trim().toCharArray();
        char[] firstWord = new char[twoString.length];
        char[] secondWord = new char[twoString.length];

        boolean firstWordEnd = false;
        boolean secondWordEnd = false;

        for (int i = 0,j=0; i < twoString.length; i++,j++) {
            if (((int) twoString[i]) == 32){
                firstWordEnd =true;
                j = 0;
                i++;
            }
            if (!firstWordEnd){
                firstWord[j] = twoString[i];
            }
            else {
                secondWord[j] = twoString[i];
            }

        }

        int result = 0;

        int maxLength = 0;
        if (firstWord.length >= secondWord.length){
            maxLength = firstWord.length;
        }

        boolean end = false;
        firstWordEnd = false;
        secondWordEnd = false;

        for (int i = 0; i < firstWord.length; i++) {


            int check1 = firstWord[i];
            int check2 = secondWord[i];

            if (check1 == 0){
                firstWordEnd = true;
            }
            if (check2 == 0){
                secondWordEnd = true;
            }
            if (firstWordEnd && secondWordEnd){
                break;
            }
            if (!secondWordEnd && !firstWordEnd){
                result += ((int) firstWord[i] * ((int) secondWord[i]));
            }
            else if (firstWordEnd){
                result += ((int) secondWord[i]);
            }
            else if(secondWordEnd){
                result += ((int) firstWord[i]);
            }
        }
        System.out.println(result);
    }
}