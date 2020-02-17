package com.example.demo.Java1.Java1_practik;

import java.util.Scanner;

/*
Create Console Application project in Java.
In method main() write code for solving next tasks:
Define integer variables a and b. Read values a and b from Console and calculate:
 a + b, a - b, a * b, a / b.
Output obtained results.

 */
public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input variable A  ");
        int a = sc.nextInt();
        System.out.println("Input variable B");
        int b = sc.nextInt();

        System.out.println("Addition = "+ (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " +(a/b));

    }

}
