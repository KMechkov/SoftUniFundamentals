package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        int lines = Integer.parseInt(console.nextLine());
        Map<Integer,Map<String,Integer>> information = new TreeMap<>();

        for (int i = 0; i < lines; i++) {
            String[] input = console.nextLine().split(" ");

            String mesec = String.valueOf(input[0].charAt(3)) + String.valueOf(input[0].charAt(4));
            Integer intmesec = Integer.parseInt(mesec);
            String name = input[1];
            Integer meters = Integer.parseInt(input[2]);

            if (information.containsKey(intmesec)){
                if (information.get(intmesec).containsKey(name)){
                    Integer lastValue = information.get(intmesec).get(name);
                    information.get(intmesec).put(name,lastValue + meters);
                }
                else {
                    information.get(intmesec).put(name,meters);
                }
            }
            else {
                information.put(intmesec,new TreeMap(){{put(name,meters);}});
            }
        }
        for (Map.Entry<Integer, Map<String, Integer>> vsichkotoInfo : information.entrySet()){
            Integer meseca = vsichkotoInfo.getKey();
            System.out.printf("%d: ",meseca);

            List<String> ListsysMetriiInfo = new LinkedList<>();
            for (Map.Entry<String,Integer> nameAndMeters : vsichkotoInfo.getValue().entrySet()){

                String imeto = nameAndMeters.getKey();
                Integer metrite = nameAndMeters.getValue();
                String imeimetri = imeto + "(" + metrite.toString() + ")";
                ListsysMetriiInfo.add(imeimetri);

            }
            System.out.println(String.join(", ",ListsysMetriiInfo));
        }
    }
}