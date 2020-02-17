package com.example.demo.Java8.Pracktic.String_Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
Using regular expressions implement checking the user name for validity.
 Input five names in the main method .
  Output a message to the console of the validation of each of the entered names.

 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        String name = sc.next();
        Pattern pattern = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher matcher = pattern.matcher(name);
        boolean out = matcher.matches();
        System.out.println(out);

    }
}
