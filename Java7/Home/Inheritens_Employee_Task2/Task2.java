package com.example.demo.Java7.Home.Inheritens_Employee_Task2;

import java.util.ArrayList;

/*
Create class ContractEmployee,
which implement interface and are inherited from the base class.
Describe hourly paid workers in the relevant classes (one of the children),
and fixed paid workers (second child).
Describe the string variable socialSecurityNumber in the class SalariedEmployee .
Include a description of federalTaxIdmember in the class of contractEmployee .
The calculation formula for the "time-worker“
is: "the average monthly salary = hourly rate * number of hours worked"
For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“
Create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers descending the average monthly wage.
Output the employee ID, name, and the average monthly wage for all elements of the list.

 */
public class Task2 {

    public static void main(String[] args){

        ArrayList<Employee> myEmployee = new ArrayList<Employee>();

        myEmployee.add(new ContractEmployee("Ira", "001", "Lviv", 32.5, 167.00 ));
        myEmployee.add(new SalariedEmployee("Igor", "002", "Tumbler", 31.5 ));
        myEmployee.add(new ContractEmployee("Katia", "003", "Kraft", 12.5, 137.00 ));
        myEmployee.add(new SalariedEmployee("Tolik", "004", "Toronto", 34.5));
        myEmployee.add(new ContractEmployee("Oleg", "005", "Taxi", 76.5, 280.00 ));


        System.out.println("Print employee");
        printAll(myEmployee);
       System.out.println("-------------");
        System.out.println("Sort lis by salary");
        printBySalary(myEmployee);

    }
    public static void  printAll(ArrayList<Employee> myEmployee){
        for (int i = 0; i<myEmployee.size(); i++){
            System.out.println(myEmployee.get(i).toString());
        }
    }

    public static ArrayList<Employee> sortBySalary(ArrayList<Employee> myEmployee){
        ArrayList<Employee> employess= ( ArrayList<Employee>) myEmployee.clone();
        Employee employee;
        for (int i = 0; i <employess.size() ; i++) {
            for (int j = i+1; j <employess.size() ; j++) {
                if ( employess.get(i).calculatePay() < employess.get(j).calculatePay() ){
                    employee = employess.get(i);
                    employess.set(i, employess.get(j));
                    employess.set(j, employee);
                }
            }
        }
        return employess;
    }

    public static void printBySalary(ArrayList<Employee> myEmployee){
        printAll(sortBySalary(myEmployee));
    }
}
