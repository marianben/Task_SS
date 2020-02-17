package com.example.demo.Java4.Home.Task1;

import java.util.Scanner;

/*
Solve the next tasks:
read 3 float numbers and check: are they all belong to the range [-5,5];
 */
public class Task1 {

    public static void main(String[] args) {

        System.out.println("Input three float numbres");
        Scanner sc = new Scanner(System.in);
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float number3 = sc.nextFloat();

        if (number1 >= -5 && number1 <= 5) {
            System.out.println("All is nice");
        } else {
            System.out.println("Bad number " + number1);
        }
        if (number2 >= -5 && number2 <= 5) {
            System.out.println("ok");
        } else {
            System.out.println("Bad number " + number2);
        }
        if (number3 >= -5 && number1 <= 5) {
            System.out.println("perfect");
        } else {
            System.out.println("Bad number " + number3);

        }
    }
}
