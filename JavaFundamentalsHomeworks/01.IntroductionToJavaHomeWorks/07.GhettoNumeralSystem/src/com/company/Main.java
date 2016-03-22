package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] input = console.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <input.length ; i++) {
            if (input[i] == '0'){

                sb.append("Gee");
            }
            else if (input[i] == '1'){
                sb.append("Bro");
            }
            else if (input[i] == '2'){
                sb.append("Zuz");
            }
            else if (input[i] == '3'){
                sb.append("Ma");
            }
            else if (input[i] == '4'){
                sb.append("Duh");
            }
            else if (input[i] == '5'){
                sb.append("Yo");
            }
            else if (input[i] == '6'){
                sb.append("Dis");
            }
            else if (input[i] == '7'){
                sb.append("Hood");
            }
            else if (input[i] == '8'){
                sb.append("Jam");
            }
            else if (input[i] == '9'){
                sb.append("Mack");
            }
        }

        System.out.println(sb.toString());

    }
}
