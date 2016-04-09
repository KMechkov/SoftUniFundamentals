package com.company;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        Map<String,Integer> repository = new LinkedHashMap<>();
        String[] sequence = console.nextLine().split(" ");
        double totalValues = 0;
        for (int i = 0; i < sequence.length -1 ; i++) {
            String a = sequence[i] + " " + sequence[i+1];
            if (repository.containsKey(a)){
                Integer lastValue = repository.get(a);
                repository.put(a,lastValue +1);
                totalValues++;
            }
            else{
                repository.put(a,1);
                totalValues++;
            }
        }

        for (Map.Entry<String,Integer> mapche : repository.entrySet()){

            double number = (mapche.getValue() /totalValues) * 100;
            System.out.printf("%s -> %.2f",mapche.getKey(),number);
            System.out.println("%");
        }
    }
}