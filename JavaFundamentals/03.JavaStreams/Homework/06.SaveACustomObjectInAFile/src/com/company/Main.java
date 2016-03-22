package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Locale.setDefault(Locale.ROOT);
        File file = new File("resources/course.save.");

        Course fundamentals = new Course("Java-Fundamentals",250);
        Course oop = new Course("OOP",450);
        Course hqc = new Course("HQC",300);
        Course java = new Course("Java-Fundamentals",250);
        Course advanceCsharp = new Course("AdvancedCsharp",200);
        List<Course> courses = new ArrayList<Course>();

        courses.add(java);
        courses.add(oop);
        courses.add(advanceCsharp);
        courses.add(fundamentals);
        courses.add(hqc);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Course> returnedCoruses = (List<Course>)ois.readObject();

        for (Course cours : returnedCoruses){
            System.out.println(cours.toString());

        }

    }
}
