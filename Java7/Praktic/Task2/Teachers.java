package com.example.demo.Java7.Praktic.Task2;

public class Teachers extends Staff {

    final static String Type_Person = "TEACHER";

    public Teachers(String name){
        setName(name);
    }

    @Override
    void print() {
        System.out.println("My name = "+ getName() + " and I`m " + Type_Person);
    }

    @Override
    public void salary() {
        System.out.println("Salary = 10000");
    }
}
