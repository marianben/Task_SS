package com.example.demo.Java7.Home.Inheritens_Bird_Task1;

public class Chicken extends NonFlyingBird {

    @Override
    void fly() {
        System.out.println("I am " + getClass().getSimpleName() );
        setFeathers("Bark");
        setLayEggs(1);
        super.fly();
    }
}
