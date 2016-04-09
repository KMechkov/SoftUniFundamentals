package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] inputLine = console.nextLine().split(" ");
        String[] cards = new String[inputLine.length];

        for (int i = 0; i <inputLine.length; i++) {
            cards[i] = inputLine[i].substring(0,inputLine[i].length() -1);
        }

        int sum = 0;
        int lastCard = 0;
        int count = 0;
        List<Integer> cardsToNumbers = ReturnSumOfCards(cards);

        for (int i = 0; i <= cardsToNumbers.size() ; i++) {
             if (cardsToNumbers.size() == 1){
                 sum += cardsToNumbers.get(i);
                 break;
             }
              if (i == cardsToNumbers.size()){
                  if (cardsToNumbers.get(i -2) == lastCard){
                      sum += (lastCard * count) * 2;
                      break;
                  }
                  else {
                      sum += lastCard;
                      break;
                  }

              }
              if (i == 0){
                  lastCard = cardsToNumbers.get(i);
                  count++;
              }
              else {
                  if (cardsToNumbers.get(i) == lastCard){
                      count++;
                  }
                  else {
                      if (count > 1){
                          sum += (lastCard * count) *2;
                          count = 1;
                          lastCard = cardsToNumbers.get(i);
                      }
                      else {
                          sum += lastCard;
                          lastCard = cardsToNumbers.get(i);
                      }
                  }
              }
        }
        System.out.println(sum);
    }
    public static List<Integer> ReturnSumOfCards(String[] cards){

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < cards.length ; i++) {
            switch (cards[i]){
                case "2":
                    numbers.add(2);
                    break;
                case "3":
                    numbers.add(3);
                    break;
                case "4":
                    numbers.add(4);
                    break;
                case "5":
                    numbers.add(5);
                    break;
                case "6":
                    numbers.add(6);
                    break;
                case "7":
                    numbers.add(7);
                    break;
                case "8":
                    numbers.add(8);
                    break;
                case "9":
                    numbers.add(9);
                    break;
                case "10":
                    numbers.add(10);
                    break;
                case "J":
                    numbers.add(12);
                    break;
                case "Q":
                    numbers.add(13);
                    break;
                case "K":
                    numbers.add(14);
                    break;
                case "A":
                    numbers.add(15);
                    break;
            }
        }
       return numbers;
    }
}