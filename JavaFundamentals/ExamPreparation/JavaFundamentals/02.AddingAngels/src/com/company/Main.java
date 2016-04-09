package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        boolean findSequence = false;
        int nqmasmisal = Integer.parseInt(console.nextLine());
        String[] numbers = console.nextLine().split("\\s+");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i +1; j < numbers.length ; j++) {
                for (int k = j +1; k < numbers.length ; k++) {
                    if ((Integer.parseInt(numbers[i]) + Integer.parseInt(numbers[j]) + Integer.parseInt(numbers[k]))
                            % 360 == 0){
                        findSequence =true;
                        System.out.printf("%s + %s + %s = %d degrees",numbers[i],numbers[j],numbers[k],
                                (Integer.parseInt(numbers[i]) + Integer.parseInt(numbers[j]) + Integer.parseInt(numbers[k])));
                        System.out.println();
                    }
                }
            }
        }
        if (!findSequence){
            System.out.println("No");
        }
    }
}
