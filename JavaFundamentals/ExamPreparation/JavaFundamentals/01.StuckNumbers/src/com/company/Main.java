package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        int countNumbers = Integer.parseInt(console.nextLine());
        String[] numbers = console.nextLine().split(" ");
        boolean cannotFindEquals = true;
        for (int a = 0; a < numbers.length ; a++) {
            for (int b = 0; b < numbers.length ; b++) {
                String aplusb = numbers[a] + numbers[b];
                for (int c = 0; c < numbers.length ; c++) {

                    for (int d = 0; d < numbers.length ; d++) {
                        String bplusc = numbers[c] + numbers[d];
                        if (!numbers[a].equals(numbers[b]) && !numbers[a].equals(numbers[c]) && !numbers[a].equals(numbers[d])&&
                        !numbers[b].equals(numbers[c]) && !numbers[b].equals(numbers[d]) && !numbers[c].equals(numbers[d])){
                            if (aplusb.equals(bplusc)){
                                System.out.printf("%s|%s==%s|%s",
                                        numbers[a],numbers[b],numbers[c],numbers[d]);
                                System.out.println();
                                cannotFindEquals = false;
                            }
                        }
                    }
                }
            }
        }
        if (cannotFindEquals){
            System.out.println("No");
        }
    }
}