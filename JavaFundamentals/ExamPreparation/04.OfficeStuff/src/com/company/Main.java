package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        Map<String,LinkedHashMap<String,Integer>> repository = new TreeMap<>();
        int lines = Integer.parseInt(console.nextLine());
        for (int i = 0; i < lines ; i++) {
            String input = console.nextLine();
            input = input.replaceAll("[\\\\|-]+","");
            String[] input2 = input.split(" ");
            String company = input2[0];
            String product = input2[4];
            Integer amount = Integer.parseInt(input2[2]);
            Integer lastAmount =0;
            if (!repository.containsKey(company)){
                repository.put(company,new LinkedHashMap<>());
                repository.get(company).put(product,amount);
            }
            else {
                if (!repository.get(company).containsKey(product)){
                    repository.get(company).put(product,amount);
                }
                else {
                    lastAmount = repository.get(company).get(product);
                    repository.get(company).put(product,lastAmount + amount);
                }
            }
        }
        for (Map.Entry<String,LinkedHashMap<String,Integer>> company : repository.entrySet()){
            System.out.printf("%s: ",company.getKey());
            int count = 0;
            for (Map.Entry<String,Integer> productAndAmount : company.getValue().entrySet()){
                count++;
                if (count < company.getValue().size()){
                    System.out.printf("%s-%d, ",productAndAmount.getKey(),productAndAmount.getValue());
                }
                else {
                    System.out.printf("%s-%d",productAndAmount.getKey(),productAndAmount.getValue());
                }
            }
            System.out.println();
        }
    }
}
