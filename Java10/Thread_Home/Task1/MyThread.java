package com.example.demo.Java10.Thread_Home.Task1;

public class MyThread extends Thread {

    private String name;
    private int time;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i<5;i++){
            System.out.println(name);
            try {
                sleep(time);
                System.out.println(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
