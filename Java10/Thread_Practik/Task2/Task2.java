package com.example.demo.Java10.Thread_Practik.Task2;
/*
Output two messages «Hello, world» and «Peace in the peace»
5 times each with the intervals of 2 seconds, and the second - 3 seconds.
 After printing messages, print the text «My name is …»

 */
public class Task2 extends Thread{

    public static void main(String[] args)  {

            Thread_My thread_my = new Thread_My("Hello,world",2000 );
            Thread_My thread_my1 = new Thread_My("Pleace in pleace", 3000);

            thread_my.start();
            thread_my1.start();

            try {
                thread_my.join();
                thread_my1.join();
            }catch (Exception e){
                e.printStackTrace();
            }


    }

}
