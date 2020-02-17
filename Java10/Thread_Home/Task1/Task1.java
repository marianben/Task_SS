package com.example.demo.Java10.Thread_Home.Task1;

import com.example.demo.Java10.Thread_Practik.Task2.Thread_My;

/*
Run three threads and output
there different messages for 5 times.
The third thread supposed to start after
finishing working of the two previous threads.

 */
public class Task1 {

    public static void main(String[] args) {

        Thread_My thread_my = new Thread_My("Hello",2000 );
        Thread_My thread_my1 = new Thread_My("world",4000 );
        Thread_My thread_my2 = new Thread_My("My name",6000 );
        Thread_My thread_my3= new Thread_My("is",8000 );
        Thread_My thread_my4= new Thread_My("Marik",10000 );

        thread_my.start();
        thread_my1.start();

        thread_my3.start();
        thread_my4.start();

        try {
            thread_my.join();
            thread_my1.join();
            thread_my2.join();
            thread_my3.join();
            thread_my4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread_my2.start();
    }

}
