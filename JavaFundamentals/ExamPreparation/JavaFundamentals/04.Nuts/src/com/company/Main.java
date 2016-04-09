package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        Map<String,LinkedHashMap<String,Integer>> repository = new TreeMap<>();

        int line = Integer.parseInt(console.nextLine());
        for (int i = 0; i < line; i++) {
            String[] input = console.nextLine().split(" ");
            String company = input[0];
            String product = input[1];
            Integer value = Integer.parseInt(input[2].substring(0,input[2].length() -2));
            Integer lastValue = 0;
            if (!repository.containsKey(company)){
                repository.put(company,new LinkedHashMap<>());
                repository.get(company).put(product,value);
            }
            else {
                if (!repository.get(company).containsKey(product)){
                    repository.get(company).put(product,value);
                }
                else {
                    lastValue = repository.get(company).get(product);
                    repository.get(company).put(product,lastValue + value);
                }
            }
        }
        for (Map.Entry<String,LinkedHashMap<String,Integer>> theCompany : repository.entrySet()){
            System.out.printf("%s: ",theCompany.getKey());
            int count = 0;
            for (Map.Entry<String,Integer> producti : theCompany.getValue().entrySet()){
                if (count < theCompany.getValue().size() -1){
                    System.out.printf("%s-%dkg, ",producti.getKey(),producti.getValue());
                    count++;
                }
                else {
                    System.out.printf("%s-%dkg",producti.getKey(),producti.getValue());
                    count++;
                }
            }
            System.out.println();
        }
    }
}