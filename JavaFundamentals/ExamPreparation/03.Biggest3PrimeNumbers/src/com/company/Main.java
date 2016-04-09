package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        String numbers = console.nextLine();

        List<Integer> primeNumbers = new ArrayList<>();
        Set<Integer> list = new TreeSet<>();

        Pattern pattern = Pattern.compile("(-?\\d+)");
        Matcher matcher = pattern.matcher(numbers);
        while (matcher.find()){
            list.add(Integer.parseInt(matcher.group(1)));
        }

        List<Integer> newList = list.stream().collect(Collectors.toList());
        Collections.reverse(newList);

        for (Integer a : newList){
            if (isPrime(a) && a > 1 && primeNumbers.size() < 3
                    && !primeNumbers.contains(a)){
                primeNumbers.add(a);
            }
        }
        if (primeNumbers.size() == 3){
            int sum =  primeNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println(sum);
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}