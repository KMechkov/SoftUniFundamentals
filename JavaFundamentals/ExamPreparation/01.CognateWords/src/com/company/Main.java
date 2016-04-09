package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        List<String> words = new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            words.add(matcher.group(0));
        }
        Set<String> result = new HashSet<>();
        boolean Have = false;
        for (int i = 0; i < words.size() ; i++) {
            String firstWord = words.get(i);
            for (int j = i+1; j < words.size() ; j++) {
                String secondWord = words.get(j);
                for (int k = 0; k < words.size() ; k++) {
                    String twoWordsTogether = firstWord + secondWord;
                    String reversedTwoWordsTogether = secondWord + firstWord;
                    String allWord = words.get(k);
                    if (twoWordsTogether.equals(allWord)){
                        String word = firstWord + "|" + secondWord + "=" + words.get(k);
                        result.add(word);
                        Have = true;
                    }
                    else if(reversedTwoWordsTogether.equals(allWord)){
                        String word = secondWord + "|" + firstWord + "=" + words.get(k);
                        result.add(word);
                        Have = true;
                    }
                }
            }
        }
        if (Have){
            for (String word : result){
                System.out.println(word);
            }
        }
        else {
            System.out.println("No");
        }
    }
}