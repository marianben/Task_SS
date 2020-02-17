package com.example.demo.Java10.Thread_Home.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Create file1.txt file with a text about your career.
Read context from file into array of strings.
Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date.

 */
public class Task4 {

    public static void main(String[] args) {
        String fileName = "D:\\demo\\src\\main\\java\\com\\example\\demo\\Java10\\Thread_Home\\Task4\\file1.txt";
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

                    list.add(text);
                    count++;
                }
                System.out.println("We have line " + count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedWriter bw = null;
        try{
        FileWriter riter = new FileWriter("D:\\demo\\src\\main\\java\\com\\example\\demo\\Java10\\Thread_Home\\Task4\\file2.txt");
            bw = new BufferedWriter(riter);

            String linesNumber = getLine(list);
            bw.write(linesNumber);
            bw.newLine();
            bw.write(getLongestLine(list));
            bw.newLine();
            bw.write("Mark Ben, 25.08.1996");
            bw.newLine();
            bw.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
        getInformation();
       getLongestLine(list);




    }
    public static String getLine(List<String> list){
        return "Number of lines in file1.txt - " + list.size();
    }

    public static void getInformation(){
        try(FileReader reader = new FileReader("D:\\demo\\src\\main\\java\\com\\example\\demo\\Java10\\Thread_Home\\Task4\\file1.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static void sortListByLength(List<String> list) {
        list.sort(new StringComparator());
    }

    public static String getLongestLine(List<String> list) {
        sortListByLength(list);
        System.out.println("Longest line - " + list.get(0).length() + " symbols");
        System.out.println(list.get(0));
        return list.get(0);
    }

    private static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String arg0, String arg1) {
            return arg1.length() - arg0.length();
        }
    }
}
