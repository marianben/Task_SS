package com.example.demo.Java3.Java3_praktic.Student;

public class MainStudent {
    public static void main(String[] args) {

        Student srt1 = new Student("Ivan", 23);
        Student str2 = new Student("Ira", 21);
        Student str3 = new Student("Oleg", 45);

        str3.changeRaiting(32);
        System.out.println("Student ="  + str3);

    }

}
