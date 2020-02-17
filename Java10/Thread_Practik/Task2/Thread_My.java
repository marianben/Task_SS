package com.example.demo.Java10.Thread_Practik.Task2;

public class Thread_My extends  Thread{

    private String name;
    private int time;

    public Thread_My(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i<5;i++){
            System.out.println(name);
            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("My name is Marik");
    }
}
