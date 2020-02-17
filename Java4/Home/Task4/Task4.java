package com.example.demo.Java4.Home.Task4;
/*
Сreate class Car with fields name, breed, age.
Declare enum for field breed.
Create 3 instances of type Car.
Check if there is no two dogs with the same name.
Display the name and the kind of the oldest dog.

 */
public class Task4 {

    public static void main(String[] args) {

        Dog_breed dog_breed;
        dog_breed = Dog_breed.HASKI;

        Dog dog1 = new Dog("Hugo", Dog_breed.BOOLDOG, 4);
        Dog dog2 = new Dog("Jesika", Dog_breed.HASKI, 5);
        Dog dog3 = new Dog("Archhi", Dog_breed.PITBULL, 8);

        Dog dogs[] ={dog1,dog2,dog3};
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        if (dog1.getAge()>dog2.getAge()&&dog1.getAge()>dog3.getAge()){
            System.out.println("Oldest dog " + dog1.getName() + " "+dog1.getBreed());
        }else if(dog2.getAge()>dog1.getAge()&&dog2.getAge()>dog3.getAge()){
            System.out.println("Oldest dog " + dog2.getName() + " "+ dog2.getBreed());
        }else if(dog3.getAge()>dog1.getAge()&&dog3.getAge()>dog2.getAge()){
            System.out.println("Oldest dog " + dog3.getName() +  " "+ dog3.getBreed());
        }else {
            System.out.println("Age are ====");
        }

        System.out.println("There " + (Dog.Same_name(dogs)?"are ":"aren`t ") + "dogs with the same name");

    }

}
