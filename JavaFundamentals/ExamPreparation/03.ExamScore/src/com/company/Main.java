package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        Map<Integer,Map<String,Double>> repository = new TreeMap<>();
        String input = console.nextLine();
        int count = 0;
        int nameCount = 0;
        while (!input.equals("")){
            count++;
            if (count > 3){
                String name = "";
                double grade = 0;
                int points = 0;
                Pattern patternForName = Pattern.compile("[a-zA-Z]+");
                Matcher matcher = patternForName.matcher(input);
                while (matcher.find()){
                    if (nameCount == 0){
                        name += matcher.group(0) + " ";
                    }
                    else{
                        name += matcher.group(0);
                    }
                    nameCount++;
                }


                Pattern patternForGrade = Pattern.compile("[0-9][.][0-9]+");
                matcher = patternForGrade.matcher(input);
                while (matcher.find()){
                    grade = Double.parseDouble(matcher.group(0));
                }

                Pattern patternForPoints = Pattern.compile("(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])");
                matcher = patternForPoints.matcher(input);
                while (matcher.find()){
                    points = Integer.parseInt(matcher.group(0));
                }
                if (!repository.containsKey(points)){
                    if (!name.equals("")){
                        repository.put(points,new LinkedHashMap<>());
                        repository.get(points).put(name,grade);
                    }
                }
                else {
                    if (!name.equals("")){
                        repository.get(points).put(name,grade);
                    }
                }
            }
            if (input.equals("--------------------------------------------") && count > 3){
                break;
            }
            else if (input.equals("----------------------------------------") && count > 3){
                break;

            }
            nameCount = 0;
            input = console.nextLine();
        }


        for (Map.Entry<Integer,Map<String, Double>> pyrviRechnik : repository.entrySet()){
            System.out.printf("%d -> ",pyrviRechnik.getKey());
            Set<String> names = new TreeSet<>();
            double result =0;
            double Doublecount =0;
            for (Map.Entry<String,Double> vtoriRechnik : pyrviRechnik.getValue().entrySet()){
                Doublecount++;
                names.add(vtoriRechnik.getKey());
                result += vtoriRechnik.getValue();
            }
            System.out.print("[");
            System.out.print(String.join(", ",names));
            System.out.print("]");


            result = result/repository.get(pyrviRechnik.getKey()).values().size();
            result = Math.floor(result * 100 + .5 )/ 100;


            System.out.printf("; avg=%.2f\n",(result));
        }
    }
}