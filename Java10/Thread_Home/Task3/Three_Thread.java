package com.example.demo.Java10.Thread_Home.Task3;

public class Three_Thread  extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Thread three");
        }

    }



}
