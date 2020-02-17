package com.example.demo.Java7.Home.Inheritens_Employee_Task2;

public abstract class Employee implements CalculetePay{

    private String name;
    private String   employeeld;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public Employee(String name, String employeeld) {
        this.name = name;
        this.employeeld = employeeld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeld='" + employeeld + '\'' +
                '}';
    }
}
