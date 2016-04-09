package com.company;
import java.math.BigDecimal;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        List<BigDecimal> numbers = new LinkedList<>();

        int lines = Integer.parseInt(console.nextLine());

        for (int i = 0; i < lines; i++) {
            BigDecimal number = console.nextBigDecimal();
            numbers.add(number);
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);

        int count = 0;
        for(BigDecimal number : numbers){
            if (count < 3){
                System.out.println(number.toPlainString());
            }
            count++;
        }
    }
}