package com.example.demo.Java5.Home.Task5;

import java.util.Scanner;

/*
Create class Car with fields type, year of production and engine capacity.
Create and initialize four instances of class Car.
Display cars certain model year  (enter year in the console);
ordered by the field year.

 */
public class Task5 {

    public static void main(String[] args) {

        Car [] cars = new Car[4];
        cars[0] = new Car("Audi", 2018, 2.9);
        cars[1] = new Car ("BMW", 2009,4.0);
        cars [2] = new Car("Lexus", 2017,5.0);
        cars [3] = new Car("Opel", 1999,1.8);


        Scanner sc = new Scanner(System.in);
        System.out.println("Input year");
        int year_input = sc.nextInt();

        for (int i = 0; i <cars.length ; i++) {
            if(year_input==cars[i].getYearOfBirth()){
                System.out.println(cars[i]);
            }
        }
        System.out.println("------------------");
        for (int i = 0; i <cars.length-1 ; i++) {
            for (int j = i+1; j <cars.length ; j++) {
                if(cars[i].getYearOfBirth()<cars[j].getYearOfBirth()){
                    Car car=cars[i];
                    cars[i]=cars[j];
                    cars[j]=car;
                }
            }

        }
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);

        }
            }
        }