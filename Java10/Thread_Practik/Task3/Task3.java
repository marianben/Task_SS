package com.example.demo.Java10.Thread_Practik.Task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Prepare mytext.txt file with a lot of text inside.
Read context from file into array of strings.
Each array item contains one line from file.
Complete next tasks:
   1) count and write the number of symbols in every line.
   2) find the longest and the shortest line.
   3) find and write only that lines, which consist of word «var»

 */
public class Task3 {

    public static void main(String[] args) {

        String fileName = "D:\\demo\\src\\main\\java\\com\\example\\demo\\Java10\\Thread_Practik\\Task3\\metext.txt";
        FileReader fr = null;
        BufferedReader br = null;

        List<String> list = new ArrayList<String>();

        int count = 0;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String text = null;

            try {
                while ((text = br.readLine()) != null) {
                    System.out.println("We have " + text.length() + " symbols in line " + count);
                    list.add(text);
                    count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        getLongestLine(list);
        getShortestLine(list);

        findText(list, "var");
    }

    public static void sortListByLength(List<String> list) {
        list.sort(new StringComparator());
    }

    public static void getLongestLine(List<String> list) {
        sortListByLength(list);
        System.out.println("Longest line - " + list.get(0).length() + " symbols");
        System.out.println(list.get(0));
    }

    public static void getShortestLine(List<String> list) {
        sortListByLength(list);
        System.out.println("Longest line - " + list.get(list.size() - 1).length() + " symbols");
        System.out.println(list.get(list.size() - 1));
    }

    public static void findText(List<String> list, String text) {
        System.out.println("looking for var...");
        Pattern p = Pattern.compile(text);
        Matcher m;
        for (String string : list) {
            m = p.matcher(string);

            while (m.find()) {
                System.out.println(string);
            }
        }
    }

    private static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String arg0, String arg1) {
            return arg1.length() - arg0.length();
        }
    }
}
