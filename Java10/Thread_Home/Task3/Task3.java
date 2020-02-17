package com.example.demo.Java10.Thread_Home.Task3;
/*
Create a thread «one», which would start the thread «two»,
which has to output its number («Thread number two») 3 times
and create thread «three», which would to output
message «Thread number three» 5 times.
 */
public class Task3 {

    public static void main(String[] args) {

        Thread t = new One_Thread();
        t.start();

    }

}
