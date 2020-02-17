package com.example.demo.Java3.Java3_Home;

public class main_person {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan", 1932);
        Person p2 = new Person("Toha", 1954);
        Person p3 = new Person("Sviat", 2012);
        Person p4 = new Person();
        Person p5 = new Person("katia", 1985);


        p1.Age();
        p2.Age();
        p3.Age();
        p4.Age();
        p5.Age();

        p4.Input();

        p5.ChangeName("Rostyk");

        System.out.println(p4);

    }


}
