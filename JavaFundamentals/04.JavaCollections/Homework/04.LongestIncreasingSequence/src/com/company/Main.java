package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split(" ");

        Integer[] numbers = new Integer[inputLine.length];
        for (int i = 0; i < inputLine.length; i++) {
            numbers[i] = Integer.parseInt(inputLine[i]);
        }

        List<Integer> sequence = new ArrayList<>();
        List<Integer> largestSequence = new ArrayList<>();

        for (int i = 1; i < numbers.length ; i++) {

            if(i+2 > numbers.length){

                if (numbers[i] > numbers[i -1]){
                    if (!sequence.contains(numbers[i-1])){
                        sequence.add(numbers[i -1]);
                    }
                    if (!sequence.contains(numbers[i])){
                        sequence.add(numbers[i]);
                    }
                    for (int number : sequence) {
                        System.out.print(number + " ");
                    }
                    System.out.println();
                    if (sequence.size() > largestSequence.size()) {
                        largestSequence.clear();
                        for (int j = 0; j < sequence.size(); j++) {
                            largestSequence.add(sequence.get(j));
                        }
                    }
                }
                else{
                    if (!sequence.contains(numbers[i-1])){
                        sequence.add(numbers[i -1]);
                    }

                    for (int number : sequence) {
                        System.out.print(number + " ");
                    }

                    if (sequence.size() > largestSequence.size()) {
                        largestSequence.clear();
                        for (int j = 0; j < sequence.size(); j++) {
                            largestSequence.add(sequence.get(j));
                        }
                    }
                    System.out.println();
                    sequence.clear();
                    sequence.add(numbers[i]);
                    for (int number : sequence) {
                        System.out.print(number + " ");
                    }
                    if (sequence.size() > largestSequence.size()) {
                        largestSequence.clear();
                        for (int j = 0; j < sequence.size(); j++) {
                            largestSequence.add(sequence.get(j));
                        }
                    }
                    System.out.println();
                    sequence.clear();

                }
                break;
            }
            if (!(numbers[i - 1] < numbers[i]) && (sequence.size() == 0)) {
                sequence.add(numbers[i - 1]);
            }
            if (numbers[i - 1] < numbers[i]) {
                if (!sequence.contains(numbers[i - 1])) {
                    sequence.add(numbers[i - 1]);
                }
                if (!sequence.contains(numbers[i])) {
                    sequence.add(numbers[i]);
                }
            }
            else {
                for (int number : sequence) {
                    System.out.print(number + " ");
                }
                System.out.println();
                if (sequence.size() > largestSequence.size()) {
                    largestSequence.clear();
                    for (int j = 0; j < sequence.size(); j++) {
                        largestSequence.add(sequence.get(j));
                    }
                }
                sequence.clear();
            }
        }
        if (largestSequence.size() >= sequence.size()) {
            System.out.print("Longest: ");
            for (int number : largestSequence) {
                System.out.print(number + " ");

            }
        }else{
            System.out.print("Longest: ");
            for (int number : sequence) {
                System.out.print(number + " ");

            }
        }
    }
}