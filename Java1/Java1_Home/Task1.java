package com.example.demo.Java1.Java1_Home;

import java.util.Scanner;

import static java.lang.Math.PI;

/*
Create console application. In method main() write code for solving next tasks:
Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius.
Output obtained results.
 */
public class Task1 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Input perimeter: ");
        int radius = sc.nextInt();
        System.out.println("Perimeter area = " + (2*PI*radius));

    }

}
