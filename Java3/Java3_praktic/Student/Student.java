package com.example.demo.Java3.Java3_praktic.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Create Console Application project in Java.
        Add class Student to the project.
        Class Student should consists of
        two private fields: name and rating;
        properties for access to these fields
static field avgRating – average rating of all students
default constructor and constructor with parameters
        methods:
        betterStudent - to definite the better student (between two, return true or false)
        toString - to output information about student
        changeRating - to change the rating of student
        In the method main() create 3 objects of Student type and input information about them.
        Display the average and total rating of all student.
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {


    private String name;
    private int raiting;
    private static double avgRaitong = 0;


    public boolean betterStudent( Student str) {
        return this.getRaiting()>str.getRaiting();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", raiting=" + raiting +
                '}';
    }

    public void changeRaiting (int raiting) {
        setRaiting(raiting);
    }


}