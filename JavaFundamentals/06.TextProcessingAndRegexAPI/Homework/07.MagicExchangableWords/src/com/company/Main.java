package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] twoStrings = console.nextLine().split(" ");
        String firstString = twoStrings[0];
        String secondString = twoStrings[1];
        boolean result = true;

        Map<Character,Character> magicWord = new HashMap<>();
        for (int i = 0; i <firstString.length() ; i++) {
            if (magicWord.containsKey(firstString.charAt(i))) {
                if (magicWord.get(firstString.charAt(i)) != secondString.charAt(i)){
                    result = false;
                }
            }
            else {
                if (secondString.charAt(i) == secondString.charAt(i +1))
                {
                    magicWord.put(firstString.charAt(i),secondString.charAt(i));
                    i++;
                }
                else {
                    magicWord.put(firstString.charAt(i),secondString.charAt(i));
                }
            }
        }
        System.out.println(result);
    }
}