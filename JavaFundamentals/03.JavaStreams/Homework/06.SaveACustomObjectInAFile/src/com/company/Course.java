package com.company;

import jdk.internal.dynalink.linker.LinkerServices;

import java.io.Serializable;

/**
 * Created by kriss on 21.3.2016 г..
 */
public class Course  implements Serializable {

    private String name;
    private Integer numberOfStudents;

    public Course(String name, Integer numberOfStudents){

        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return String.format("Course name: %s, Number of students: %d",name,numberOfStudents);
    }
}
