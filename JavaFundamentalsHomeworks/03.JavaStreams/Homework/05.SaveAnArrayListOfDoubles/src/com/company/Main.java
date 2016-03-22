package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Locale.setDefault(Locale.ROOT);
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(0.69);
        doubles.add(1.69);
        doubles.add(2.69);
        doubles.add(3.69);
        doubles.add(4.69);
        doubles.add(5.69);
        File file = new File("resources/doubles.list");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(doubles);
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Double> loadDoubles = (List<Double>) ois.readObject();
        ois.close();

        for (double number : loadDoubles){
            System.out.println(number);
        }
    }
}