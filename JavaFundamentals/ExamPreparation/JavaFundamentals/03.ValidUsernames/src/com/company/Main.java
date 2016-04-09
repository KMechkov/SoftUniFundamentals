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

        String input = console.nextLine();
        input = input.replaceAll("[\\s\\()\\/\\\\\\|]+"," ");
        Pattern pattern = Pattern.compile("\\b[a-zA-Z][a-zA-Z0-9_]{2,25}+\\b");
        Matcher matcher = pattern.matcher(input);
        List<String> usernames = new LinkedList<>();
        while (matcher.find()){
        usernames.add(matcher.group(0));
        }

        int sum = 0;
        String firstBigest = "";
        String secondBigest = "";
        for (int i = 0; i < usernames.size() -1 ; i++) {
            if (usernames.get(i).length() + usernames.get(i+1).length() > sum){
                sum = usernames.get(i).length() + usernames.get(i+1).length();
                firstBigest = usernames.get(i);
                secondBigest = usernames.get(i+1);
            }
        }
        System.out.printf("%s\n%s",firstBigest,secondBigest);
    }
}