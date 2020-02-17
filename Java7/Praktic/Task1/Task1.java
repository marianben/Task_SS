package com.example.demo.Java7.Praktic.Task1;
/*
Create interface Animal with methods voice() and feed().
 Create two classes Cat and Dog, which implement this interface.
  Create array of Animal and add some Cats and Dogs to it.
  Call voice() and feed() method for all of it

 */
public class Task1 {

    public static void main(String[] args) {

        Animal [] animals = new Animal[5];
        animals[0] = new Cat("Ivan", 3);
        animals[1]= new Dog("Lukky");
        animals[2] = new Cat("Totti", 1);
        animals[3]= new Dog("Haski");
        animals[4] = new Cat("Tom", 7);

        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i]);
        }

        animals[0].voice();
        animals[0].feed();
        animals[1].voice();
        animals[1].feed();
        animals[2].voice();
        animals[2].feed();
        animals[3].voice();
        animals[3].feed();
        animals[4].voice();
        animals[4].feed();
    }

}
