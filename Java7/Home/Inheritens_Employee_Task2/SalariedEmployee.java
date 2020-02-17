package com.example.demo.Java7.Home.Inheritens_Employee_Task2;

public class SalariedEmployee extends Employee implements  CalculetePay{

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public SalariedEmployee(String name, String employeeld, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(name, employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
