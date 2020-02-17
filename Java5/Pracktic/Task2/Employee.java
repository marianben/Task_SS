package com.example.demo.Java5.Pracktic.Task2;

import java.util.Scanner;

public class Employee {

    private String name;
    private int department_number;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department_number=" + department_number +
                ", salary=" + salary +
                '}';
    }

    public static void getSortWorkersByDepartment(Employee[] employees){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter employee department:");
        int newDepartment = sc.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (newDepartment == employees[i].getDepartment_number()) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void SortBYSalary(Employee [] employees){
        int sort;
        for (int i = 0; i <employees.length -1; i++) {
            for (int j = i+1; j <employees.length ; j++) {
                if(employees[i].getSalary()<employees[j].getSalary()){
                    Employee employee=employees[i];
                    employees[i]=employees[j];
                    employees[j]=employee;
                }
            }

        }
        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i]);

        }
    }
}
