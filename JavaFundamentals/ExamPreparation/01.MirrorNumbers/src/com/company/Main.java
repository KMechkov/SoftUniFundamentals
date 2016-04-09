package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        String[] numbers = console.nextLine().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                String obyrnat = reverse(numbers[j]);
                if (numbers[i].equals(obyrnat)){
                    System.out.printf("%s<!>%s\n",numbers[i],numbers[j]);
                }
            }
        }
    }
    public static String reverse(String string){
        String obyrnat = "";
        for (int i = string.length() -1,j = 0; i >= 0; i--,j++) {
            obyrnat += string.charAt(i);
        }
        return obyrnat;
    }
}