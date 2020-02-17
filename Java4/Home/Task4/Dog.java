package com.example.demo.Java4.Home.Task4;

import java.util.Objects;

public class Dog {

    private String name;
    private Dog_breed breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, Dog_breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog_breed getBreed() {
        return breed;
    }

    public void setBreed(Dog_breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
    
    public static  boolean  Same_name(Dog [] dogs){
        for (int i = 0; i <dogs.length-1; i++) {
            for (int j = i+1; j < dogs.length; j++) {
                if(dogs[i].getName() == dogs[j].getName())
                    return true;
            }
        }
        return false;
    }
}
