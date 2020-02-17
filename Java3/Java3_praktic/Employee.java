package com.example.demo.Java3.Java3_praktic;
/*Create Console Application project in Java.
        Add class Employee to the project.
        Class Employee should consists of
        three private fields: name, rate and hours;
    static field totalSum
        properties for access to these fields;
default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
        methods:
        salary - to calculate the salary of person (rate * hours)
        toString - to output information about employee
        changeRate - to change the rate of employee
        bonuses – to calculate 10% from salary
        In the method main() create 3 objects of Employee type. Input information about them.
        Display the total salary of all workers to screen
*/

public class Employee {

    private String name;
    private int rate;
    private int hours;

    static int totalSum=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum +=rate*hours;
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public  void Sallery(int rate, int hours){

        int sallery = rate*hours;
        System.out.println("Employe has  sallery = " + sallery);
    }

    public void changeRait(int rate){
        System.out.print("This employee = " + this.name + " have rate "+ this.rate + " end change to rate =");
        setRate(this.rate);
        System.out.println(rate);
    }

    public void bonuses(){
            int bonus= this.hours*this.rate;
            double res = bonus*0.1;
            System.out.println("This bonuse are = "+ res);
    }
}
