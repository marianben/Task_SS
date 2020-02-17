package com.example.demo.Java10.Thread_Home.Task3;

public class One_Thread  extends Thread{
    Thread t1 = new Two_Thread();

    @Override
    public void run() {
        t1.start();
    }

}
