package com.example.demo.Java7.Home.Inheritens_Bird_Task1;
/*
Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
 Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
Create array Bird and add different birds to it.
Call fly() method for all of it.
Output the information about
each type of created bird.
 */
public class Task1 {

    public static void main(String[] args) {

        Bird [] birds = new Bird[10];
        birds[0]= new Penguin();
        birds[2]= new Chicken();
        birds[3]= new Eagle();
        birds[1]= new Swallow();
        birds[4]= new Penguin();
        birds[5]= new Chicken();
        birds[6]= new Eagle();
        birds[7]= new Swallow();
        birds[8]= new Penguin();
        birds[9]= new Eagle();


        for (Bird bird: birds) {
            bird.fly();
        }
    }

}
