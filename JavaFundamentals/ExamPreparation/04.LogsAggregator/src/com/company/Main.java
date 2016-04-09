package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        Map<String,TreeSet<String>> Iptata = new LinkedHashMap<>();
        Map<String,Integer> hours = new TreeMap<>();

        int lines = Integer.parseInt(console.nextLine());
        for (int i = 0; i < lines ; i++) {
            String[] input = console.nextLine().split(" ");
            int a =5 ;
            if (Iptata.containsKey(input[1])){
                TreeSet<String> lst = Iptata.get(input[1]);
                Iptata.put(input[1],lst);
                lst.add(input[0]);
                Integer num = hours.get(input[1]);

                hours.put(input[1],Integer.parseInt(input[2]) + num);
            }
            else {
                TreeSet<String> listche = new TreeSet<>();
                Iptata.put(input[1],listche);
                listche.add(input[0]);
                hours.put(input[1],Integer.parseInt(input[2]));
            }
        }

        for (Map.Entry<String,Integer> entry : hours.entrySet()){
            System.out.printf("%s: %d [",entry.getKey(),entry.getValue());
            for (Map.Entry<String,TreeSet<String>> ip : Iptata.entrySet()){
                if (ip.getKey().equals(entry.getKey())){
                    System.out.print(String.join(", ",ip.getValue()));
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}