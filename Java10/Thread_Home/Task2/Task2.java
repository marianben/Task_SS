package com.example.demo.Java10.Thread_Home.Task2;
/*
Cause a deadlock. Organize the expectations of ending
a thread in main(), and make the end of
the method main() in this thread.

 */
public class Task2 {

    public static void main(String[] args) {

        DeadlockRisk job = new DeadlockRisk();
        Thread masha = new Thread(job, "Маша");
        Thread dasha = new Thread(job, "Даша");
        masha.start();
        dasha.start();

    }

}
