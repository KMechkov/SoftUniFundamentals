package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split("\\W+");
        Map<String,Integer> mostFrequent = new HashMap<>();

        for (int i = 0; i < inputLine.length ; i++) {
            if (!mostFrequent.containsKey(inputLine[i].toLowerCase())){
                mostFrequent.put(inputLine[i].toLowerCase(),1);
            }
            else {

                mostFrequent.put(inputLine[i].toLowerCase(),mostFrequent.get(inputLine[i].toLowerCase())+1);
            }
        }
        List<String> resultFrequent = new ArrayList<>();
        int maxCount = 0;
        for (Map.Entry<String,Integer> entry : mostFrequent.entrySet()){
            if (entry.getValue() >= maxCount){
                maxCount = entry.getValue();
            }
        }
        for (Map.Entry<String,Integer> entry : mostFrequent.entrySet()){
          if (entry.getValue() == maxCount){
              resultFrequent.add(entry.getKey());
          }
        }
        Collections.sort(resultFrequent);
        for (int i = 0; i < resultFrequent.size() ; i++) {
            System.out.println(resultFrequent.get(i) + " -> " + maxCount + " times");
        }
    }
}