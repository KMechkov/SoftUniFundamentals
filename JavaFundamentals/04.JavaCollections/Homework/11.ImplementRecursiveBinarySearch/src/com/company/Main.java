package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        int searchingIndex = Integer.parseInt(console.nextLine());
        String[] inputLine = console.nextLine().split(" ");
        int[] intmasiv = new int[inputLine.length];

        for (int i = 0; i < inputLine.length ; i++) {
            intmasiv[i] = Integer.parseInt(inputLine[i]);
        }
        int result = 0;
        result = binarySearch(intmasiv,searchingIndex);
        System.out.println(result);
    }
    public  static int binarySearch(int[] input, int searchingValue){
        return binarySearch(input,0,input.length,searchingValue);
    }
    public  static int binarySearch(int[] input,int start,int end,int searchingValue){

        try{
            int midle = ((start + end) /2)-1;
            if (input[start] == searchingValue){
                return start;
            }
            if (start +1 > end){
                return -1;
            }
            if (input[midle] == searchingValue){
                return midle;
            }
            else if(input[midle] > searchingValue){
                return binarySearch(input,start,midle -1,searchingValue);
            }
            else if(input[midle]< searchingValue){
                return  binarySearch(input,midle +1,end,searchingValue);
            }
            return binarySearch(input,start,end,searchingValue);
        }
        catch (StackOverflowError e){
            return -1;
        }
    }
}