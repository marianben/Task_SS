package com.example.demo.Java7.Home.Inheritens_Bird_Task1;

public class NonFlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("I can`t fly");
        System.out.println(toString());
    }
}
