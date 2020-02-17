package com.example.demo.Java6.Home.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.example.demo.Java6.Home.Task3.Student.*;

/*
Write class Student that provides information about the name of the student and his course.
Class Student should consists of
properties for access to these fields
constructor with parameters
method printStudents (List students, Integer course),
which receives a list of students and the course number and prints to
the console the names of the students from the list, which are taught in this course (use an iterator)
methods to compare students by name and by course
In the main() method
declare List students and add to the list five different students
display the list of students ordered by name
display the list of students ordered by course.

 */
public class Task3 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Harri", Course.HTML));
        list.add(new Student("Bred", Course.Java));
        list.add(new Student("Dina", Course.JavaScript));
        list.add(new Student("Carr", Course.PHP));
        list.add(new Student("Andry", Course.Java));

        printAll(list);
        System.out.println("------------");
        list.sort(compareByName);
        printAll(list);
        System.out.println("---!---!----");
        sortByCourse(list);
        printAll(list);
    }
    private static void printAll(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
