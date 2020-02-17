package com.example.demo.Java8.Home.String_Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Enter a sentence that contains the words between more than one space.
 Convert all spaces, consecutive, one.
  For example, if we introduce the sentence "I    am      learning     Java   Core»,
   we have to get the "I'm learning Java Core»

 */
public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input your string");
        String text = br.readLine();

        Pattern p = Pattern.compile("[\\S]+[\\s]");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()));
        }

    }
}
