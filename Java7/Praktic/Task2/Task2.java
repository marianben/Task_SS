package com.example.demo.Java7.Praktic.Task2;

import java.lang.reflect.Array;

/*
Create next structure.
In abstract class Person with property name, declare abstract method print().
In other classes in body of method print() output text “I am a …”.
In class Staff declare abstract method salary().
In each concrete class create constant TYPE_PERSON.
Output type of person in each constructors.
Create array of Person and add some Teachers, Cleaners and Students to it.
Call method print() for all of it.
Call method salary() for all Teachers and Cleaner
 */
public class Task2 {

    public static void main(String[] args) {

        Person [] person = new Person[5];
        person[0]= new Teachers("Ivan");
        person[1]= new Cleaner("Tolik");
        person[2]= new Student("Robert");
        person[3]= new Cleaner("Rafik");
        person[4]= new Student("Vova");

        for (Person persons: person) {
            persons.print();
            if (persons instanceof Staff) {
                ((Staff)persons).salary();
            }
        }

    }
}

