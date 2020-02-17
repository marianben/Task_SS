package com.example.demo.Java10.Thread_Practik.Task1;
/*
Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).

 */
public class Thread_Pracktick  extends Thread{
    public static void main(String[] args) throws Exception {
        String name = "I study Java";
        System.out.println("Sleep");

        Thread.sleep(1000);
        System.out.println(name);

    }

}
