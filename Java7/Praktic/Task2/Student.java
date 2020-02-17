package com.example.demo.Java7.Praktic.Task2;

public class Student extends Person{

    final static String TYPE_PERSON = "SUDENT";

    public Student(String name){
        setName(name);
    }

    @Override
    void print() {
        System.out.println("My name = "+ getName() + " and I`m " + TYPE_PERSON);
    }


}
