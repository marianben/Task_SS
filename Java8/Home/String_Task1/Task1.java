package com.example.demo.Java8.Home.String_Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/*
Enter in the console sentence of five words.
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order

 */
public class Task1 {

    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input your text:");
        String[] strings = br.readLine().split(" ");

        List<String> list = new ArrayList<String>();

        for (String string : strings) {
            list.add(string);
        }
        System.out.println();

        printLongestWords(list);
        System.out.println();

        System.out.println("Second word reversed - " + reverse(2, strings));
    }


    public static void printLongestWords(List<String> list) {
        int maxsize = findLongestWord(list).length();
        System.out.println("Longest words (" + maxsize + " symbols):");
        for (String string : list) {
            if (string.length() == maxsize) {
                System.out.println(string);
            }
        }
    }

    public static String findLongestWord(List<String> list) {
        Iterator<String> i = list.iterator();
        String longestWord = list.get(0);
        while (i.hasNext()) {
            String currentWord = i.next();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        return longestWord;
    }

    public static String reverse(int index, String[] strings) {
        if (index <= strings.length) {

            char[] stringAarray = strings[index - 1].toCharArray();
            char[] reversedArray = new char[strings[index - 1].length()];

            for (int i = 0; i < reversedArray.length; i++) {
                reversedArray[i] = stringAarray[reversedArray.length - i - 1];
            }
            return new String(reversedArray);
        } else {
            return "impossible, we have only 1 word";
        }
    }
}
