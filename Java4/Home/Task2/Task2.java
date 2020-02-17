package com.example.demo.Java4.Home.Task2;

import java.util.Scanner;

/*
read 3 integer numbers and write max and min of them;
 */
public class Task2 {

    public static void main(String[] args) {

        System.out.println("введіть перше число ");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        System.out.println("введіть друге число");
        Scanner b = new Scanner(System.in);
        int number1 = b.nextInt();
        System.out.println("введіть третє число ");
        Scanner c = new Scanner(System.in);
        int number2 = c.nextInt();
        a.close();
        b.close();
        c.close();
        System.out.println(" Ви ввели: " + number + "; " + number1 + "; " + number2);

        if(number > number1 && number > number2 ){
            System.out.println("Найбільше число:" + number);
        }
        if(number1 > number && number1 > number2 ){
            System.out.println("Найбільше число:" + number1);
        }
        if(number2 > number && number2 > number1 ){
            System.out.println("Найбільше число:" + number2);
        }
    }
}
