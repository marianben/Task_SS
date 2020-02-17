package com.example.demo.Java7.Praktic.Task2;

public class Cleaner extends Staff {

    final static String TYPE_PERSON = "CLEANER";

    public Cleaner(String name){
        setName(name);
    }

    @Override
    void print() {
        System.out.println("My name = "+ getName() + " and I`m " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary = 123456");
    }
}
