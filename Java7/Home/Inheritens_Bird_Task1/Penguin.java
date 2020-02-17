package com.example.demo.Java7.Home.Inheritens_Bird_Task1;

public class Penguin extends NonFlyingBird {

    @Override
    void fly() {
        System.out.println("I am " + getClass().getSimpleName() );
        setFeathers("White");
        setLayEggs(12);
        super.fly();
    }

}
