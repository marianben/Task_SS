package com.example.demo.Java1.Java1_Home;

import java.util.Scanner;

/*
Create console application. In method main() write code for solving next tasks:

Phone calls from three different countries are с1, с2 and с3 standard units per minute.
Talks continued t1, t2 and t3 minutes.
How much computer will count for each call separately and all talk together?
Input all source data from console, make calculations and output to the screen.

 */
public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What cost call to Ukrain?");
        int  country1  = sc.nextInt();
        System.out.println("What cost call to USA?");
        int  country2  = sc.nextInt();
        System.out.println("What cost call to China?");
        int  country3  = sc.nextInt();

        System.out.println("What minute call to Ukrain?");
        int  time1  = sc.nextInt();
        System.out.println("What minute call to USA?");
        int  time2  = sc.nextInt();
        System.out.println("What minute call to China?");
        int  time3  = sc.nextInt();

        System.out.println("Ukraine cost :"  + country1*time1);
        System.out.println("USA cost :"  + country2*time2);
        System.out.println("China cost :"  + country3*time3);

        System.out.println("Together talk = "+ (country1+country2+country3)+ (time1+time2+time3));
    }

}
