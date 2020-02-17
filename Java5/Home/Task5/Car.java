package com.example.demo.Java5.Home.Task5;

public class Car {

    private String type;
    private int yearOfBirth;
    private double  engine_capacity;

    public Car() {
    }

    public Car(String type, int yearOfBirth, double engine_capacity) {
        this.type = type;
        this.yearOfBirth = yearOfBirth;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", engine_capacity=" + engine_capacity +
                '}';
    }
}
