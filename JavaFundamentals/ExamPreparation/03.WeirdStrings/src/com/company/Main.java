package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String inputLine = console.nextLine();
        inputLine = inputLine.replaceAll("[,\\s\\()\\/\\\\\\|]+", "");
        inputLine = inputLine.replaceAll("[\\W+0-9]", " ");
        char[] charcheta = inputLine.toCharArray();
        String currentWord = "";
        int currentSum = 0;
        Map<Character, Integer> alphabet = new TreeMap<>();
        alphabet.put('a', 1); alphabet.put('b', 2); alphabet.put('c', 3);
        alphabet.put('d', 4); alphabet.put('e', 5); alphabet.put('f', 6);
        alphabet.put('g', 7); alphabet.put('h', 8); alphabet.put('i', 9);
        alphabet.put('j', 10); alphabet.put('k', 11); alphabet.put('l', 12);
        alphabet.put('m', 13); alphabet.put('n', 14); alphabet.put('o', 15);
        alphabet.put('p', 16); alphabet.put('q', 17); alphabet.put('r', 18);
        alphabet.put('s', 19); alphabet.put('t', 20); alphabet.put('u', 21);
        alphabet.put('v', 22); alphabet.put('w', 23); alphabet.put('x', 24);
        alphabet.put('y', 25); alphabet.put('z', 26);
        List<String> stoinost = new LinkedList<>();
        List<Integer> kliuch = new LinkedList<>();

        for (int i = 0; i < charcheta.length; i++) {
            if (i == charcheta.length -1){
                if (alphabet.containsKey(Character.toLowerCase(charcheta[i]))){
                    currentSum += alphabet.get(Character.toLowerCase(charcheta[i]));
                    currentWord += charcheta[i];
                }
                if (currentSum > 0){
                    stoinost.add(currentWord);
                    kliuch.add(currentSum);
                }

            }
            else if (alphabet.containsKey(Character.toLowerCase(charcheta[i]))){
                currentSum += alphabet.get(Character.toLowerCase(charcheta[i]));
                currentWord += charcheta[i];
            }
            else {
                if (currentSum > 0){
                    stoinost.add(currentWord);
                    kliuch.add(currentSum);
                }
                currentSum = 0;
                currentWord = "";
            }
        }
        int bigestSum = 0;
        String firstBigestWord = "";
        String secondBigestWord = "";
        for (int i = 0; i < kliuch.size()-1; i++) {
            if (kliuch.get(i) + kliuch.get(i +1) >=bigestSum){
                bigestSum = kliuch.get(i) + kliuch.get(i +1);
                firstBigestWord = stoinost.get(i);
                secondBigestWord = stoinost.get(i+1);
            }
        }
        System.out.printf("%s\n%s",firstBigestWord,secondBigestWord);
    }
}