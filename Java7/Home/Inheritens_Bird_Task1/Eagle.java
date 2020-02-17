package com.example.demo.Java7.Home.Inheritens_Bird_Task1;

public class Eagle extends FlyingBird {

    @Override
    void fly() {
        System.out.println("I am " + getClass().getSimpleName());
        setFeathers("Ping");
        setLayEggs(112);
        super.fly();
    }
}
