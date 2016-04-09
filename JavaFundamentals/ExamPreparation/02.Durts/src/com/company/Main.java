package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        Integer cX = Integer.parseInt(numbers[0]);
        Integer cY = Integer.parseInt(numbers[1]);
        Integer radius = Integer.parseInt(console.nextLine());
        int lines = Integer.parseInt(console.nextLine());

        String inputNumbers = console.nextLine();

        Pattern pattern = Pattern.compile("[-]*[0-9]+");
        Matcher matcher = pattern.matcher(inputNumbers);
        List<Integer> xAndY = new LinkedList<>();
        while (matcher.find()){
            xAndY.add(Integer.parseInt(matcher.group(0)));
        }

        for (int i = 0; i < xAndY.size() -1; i+=2) {
            int X = xAndY.get(i);
            int Y = xAndY.get(i +1);

            if (X <= (cX + radius) && X >= (cX - radius) && Y <= (cY + radius /2) && Y >= (cY - radius /2)){
                System.out.println("yes");
            }
            else if (X <= (cX + radius /2) && X >= (cX - radius /2) && Y <= (cY + radius) && Y >= (cY - radius)){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}