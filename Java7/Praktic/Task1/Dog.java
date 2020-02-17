package com.example.demo.Java7.Praktic.Task1;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("I`m a dog");
    }

    @Override
    public void feed() {
        System.out.println("I eat meat");
    }
}
