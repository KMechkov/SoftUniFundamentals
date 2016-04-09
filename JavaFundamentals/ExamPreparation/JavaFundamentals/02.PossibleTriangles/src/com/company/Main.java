package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        boolean have = false;
        while (!numbers[0].equals("End")){
            double a = Double.parseDouble(numbers[0]);
            double b = Double.parseDouble(numbers[1]);
            double c = Double.parseDouble(numbers[2]);


            if (a < c && b < c && a + b > c){
                if (a < b ){
                    System.out.printf("%.2f+%.2f>%.2f\n",a,b,c);
                }
                else {
                    System.out.printf("%.2f+%.2f>%.2f\n",b,a,c);
                }
                have = true;
            }
            else if(a < b && c < b && a + c > b){
                if (a < c ){
                    System.out.printf("%.2f+%.2f>%.2f\n",a,c,b);
                }
                else{
                    System.out.printf("%.2f+%.2f>%.2f\n",c,a,b);
                }
                have = true;
            }
            else if(b < a && c < a && c + b > a){
                if (b < c ){
                    System.out.printf("%.2f+%.2f>%.2f\n",b,c,a);
                }
                else{
                    System.out.printf("%.2f+%.2f>%.2f\n",c,b,a);
                }
                have = true;
            }
            numbers = console.nextLine().split(" ");
        }
        if (!have){
            System.out.println("No");
        }
    }
}