package com.example.demo.Java4.Praktik.Task3;

import java.util.Scanner;

/*
Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)

 */
public class Task3 {

    public static void main(String[] args) {

        System.out.println("Input name of city");
        Scanner sc= new Scanner(System.in);
        String country = sc.next();

        Continent continent;
        continent=Continent.EUROPA;

        switch (country.toLowerCase()){
            case "ukraine":
                continent=Continent.EUROPA;
                break;
            case "russia":
                continent = Continent.AZIA;
                break;
            case "Egyput":
                continent = Continent.AFRUKA;
                break;
            default:
                System.out.println("There are no continent");

        }
        System.out.println("You input "+ continent);
    }
}
