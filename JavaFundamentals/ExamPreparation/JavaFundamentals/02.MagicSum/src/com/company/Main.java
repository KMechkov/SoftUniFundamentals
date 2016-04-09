package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        int divider = Integer.parseInt(console.nextLine());
        String input = console.nextLine();
        List<Integer> numbers = new LinkedList<>();

        while (!input.equals("End")){
            numbers.add(Integer.parseInt(input));
            input = console.nextLine();
        }
        int a =0;
        int b =0;
        int c =0;
        int finala = Integer.MIN_VALUE;
        int finalb = Integer.MIN_VALUE;
        int finalc = Integer.MIN_VALUE;
        boolean have = false;

        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.size() < 3){
                break;
            }
            a = numbers.get(i);
            for (int j = i+1; j < numbers.size() ; j++) {
                b = numbers.get(j);
                for (int k = j+1; k < numbers.size(); k++) {
                    c = numbers.get(k);
                    if ((a + b +c) % divider ==0 ){
                        if ((a + b +c) > (finala + finalb + finalc)){
                            finala = a;
                            finalb = b;
                            finalc = c;
                            have = true;
                        }
                    }
                }
            }
        }
        if (have){
            System.out.printf("(%d + %d + %d) %% %d = 0",finala,finalb,finalc,divider);
        }
        else {
            System.out.println("No");
        }
    }
}