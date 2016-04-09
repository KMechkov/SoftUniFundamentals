package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        Map<String,TreeMap<String,Integer>> repository = new LinkedHashMap<>();

        int lines = Integer.parseInt(console.nextLine());

        for (int i = 0; i < lines ; i++) {
            String[] information = console.nextLine().split(" ");
            String product = information[2];
            String name = information[0];
            Integer amount = Integer.parseInt(information[1]);


            if (repository.containsKey(product)){
                if (repository.get(product).containsKey(name)){
                    Integer lastValue = repository.get(product).get(name);
                    repository.get(product).put(name,lastValue + amount);
                }
                else {
                    repository.get(product).put(name,amount);
                }
            }
            else {
                repository.put(product,new TreeMap<>());
                repository.get(product).put(name,amount);
            }
        }
      for (Map.Entry<String,TreeMap<String,Integer>> allInfo : repository.entrySet()){
          String finalProduct = allInfo.getKey();
          System.out.printf("%s: ",finalProduct);
          List<String> zaProductaBe = new LinkedList<>();
          for(Map.Entry<String,Integer> zaProducta : allInfo.getValue().entrySet()){
                zaProductaBe.add(zaProducta.getKey()+ " " + zaProducta.getValue());
          }
          System.out.print(String.join(", ",zaProductaBe));
          System.out.println();
      }
    }
}