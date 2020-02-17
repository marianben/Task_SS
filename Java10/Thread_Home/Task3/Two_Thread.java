package com.example.demo.Java10.Thread_Home.Task3;

public class Two_Thread extends Thread {
    Thread t2 = new Three_Thread();

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println("Thread two");
        }
        t2.start();
    }


}
