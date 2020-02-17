package com.example.demo.Java7.Home.Inheritens_Bird_Task1;

public class Swallow extends FlyingBird {

    @Override
    void fly() {
        System.out.println("I am " + getClass().getSimpleName() );
        setFeathers("Blue");
        setLayEggs(13);
        super.fly();
    }

}
