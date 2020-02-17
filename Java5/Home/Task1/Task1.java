package com.example.demo.Java5.Home.Task1;

import java.util.Scanner;

/*
Ask user to enter the number of month.
Read the value and write the amount of days in this
month (create array with amount days of each month).

 */
public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of month ");
        int month_number = sc.nextInt();
        int month;

        int [] amount_month = {31, 29,31,30,31,30,31,31,30,31,30,31};
        switch (month_number) {
            case 1:
                System.out.println(amount_month[0]);
                break;
            case 2:
                System.out.println(amount_month[1]);
                break;
            case 3:
                System.out.println(amount_month[2]);
                break;
            case 4:
                System.out.println(amount_month[3]);
                break;
            case 5:
                System.out.println(amount_month[4]);
                break;
            case 6:
                System.out.println(amount_month[5]);
                break;
            case 7:
                System.out.println(amount_month[6]);
                break;
            case 8:
                System.out.println(amount_month[7]);
                break;
            case 9:
                System.out.println(amount_month[8]);
                break;
            case 10:
                System.out.println(amount_month[9]);
                break;
            case 11:
                System.out.println(amount_month[10]);
                break;
            case 12:
                System.out.println(amount_month[11]);
                break;
        }
    }
 }
