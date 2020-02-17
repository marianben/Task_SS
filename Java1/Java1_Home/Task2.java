package com.example.demo.Java1.Java1_Home;

import java.util.Scanner;

/*
Create console application. In method main() write code for solving next tasks:
Define String variables name and address.
Output question "What is your name?" Read the value name and output next question:
“Where are you live, (name)?". Read address and write whole information.

 */
public class Task2 {

    public static void main(String[] args) {

        System.out.println("What is yuot name?");
        Scanner sc = new Scanner(System.in);
        String name  =sc.next();
        System.out.println("Where are you live " + name);
        String addrres = sc.next();
        System.out.println("Your name is "  + name+ " and "
                            + " you live in "+ addrres );

    }

}
