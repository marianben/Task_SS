package com.example.demo.Java5.Pracktic.Task2;

import java.util.Scanner;

/*
Create a class Employee with fields name, department number, salary.
Create five objects of class Employee.
Display all employees of a certain department (enter department number in the console);
arrange workers by the field salary in descending order.
 */
public class Task2 {

    public static void main(String[] args) {

    Employee []employees = new Employee[5];
    employees[0] = new Employee("Ivan", 43,3223);
    employees[1] = new Employee("Ira", 433,65874);
    employees[2]= new Employee("Anna", 432,1645);
    employees[3] = new Employee("Angelina", 43,87331);
    employees[4] = new Employee("Alina", 43,457821);

    Employee.getSortWorkersByDepartment(employees);
        System.out.println("--------------------");

    Employee.SortBYSalary(  employees);
    }

}
