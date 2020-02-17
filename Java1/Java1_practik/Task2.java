package com.example.demo.Java1.Java1_practik;

import java.util.Scanner;

/*Create Console Application project in Java.
        In method main() write code for solving next tasks:
      Output question “How are you?“. Define string variable answer.
      Read the value answer and output: “You are (answer)".
        */
public class Task2 {

    public static void main(String[] args) {

        System.out.println("How are you ?");
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        System.out.println("You are " + message);

    }

}
