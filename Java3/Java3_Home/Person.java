package com.example.demo.Java3.Java3_Home;


import java.util.Calendar;
import java.util.Scanner;


public class Person {

    private String name;
    private int birthYear;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void Age(){

        int age  = Calendar.getInstance().getTime().getYear()-this.birthYear;
        System.out.println("This age are =  "+ age);
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input  name");
        String name1 = sc.next();
        this.name=name1;
        System.out.println("Input age");
        int age1 = sc.nextInt();
        this.birthYear = age1;
        System.out.println("You create person with name "+name1+" and age " + age1);
        sc.close();
    }

    public void ChangeName(String name){
        setName(name);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

}
