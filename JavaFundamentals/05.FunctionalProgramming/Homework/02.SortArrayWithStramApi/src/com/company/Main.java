package com.company;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        String sortingOrder = console.nextLine();
        List<Integer> numbers = Arrays.stream(input)
                .filter(x -> x.matches("\\d+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> sortedNumbers = new ArrayList<>();
        if (sortingOrder.equals("Ascending")){
           sortedNumbers =  numbers.stream()
                    .sorted((x,y) -> x.compareTo(y))
                    .collect(Collectors.toList());
        }
        else if (sortingOrder.equals("Descending"))
        {
            sortedNumbers = numbers.stream()
                    .sorted((x,y) -> y.compareTo(x))
                    .collect(Collectors.toList());
        }
        sortedNumbers.forEach(number -> System.out.print(number + " "));
    }
}