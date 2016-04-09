package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String elements = console.nextLine().toLowerCase();
        String comperator = console.nextLine();
        int count = 0;
        if (comperator.length()== 1){
            for (int i = 0; i < elements.length() ; i++) {
                if (comperator.equals(elements.charAt(i)))
                {
                    count++;
                }
            }
        }
        if (comperator.length()== 2){
            for (int i = 1; i < elements.length() ; i++) {
                if (comperator.charAt(0) == elements.charAt(i-1)
                    && comperator.charAt(1) == elements.charAt(i))
                {
                    count++;
                }
            }
        }
        if (comperator.length()== 3){
            for (int i = 2; i < elements.length() ; i++) {
                if (comperator.charAt(0) == elements.charAt(i-2)
                        && comperator.charAt(1) == elements.charAt(i -1)
                        && comperator.charAt(2) == elements.charAt(i))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
