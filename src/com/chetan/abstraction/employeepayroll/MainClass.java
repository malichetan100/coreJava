package com.chetan.abstraction.employeepayroll;

public class MainClass {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee(123,"Chetan",0);
        salariedEmployee.calculatePay(5);
        salariedEmployee.displayDetails();
        System.out.println("=================");

        HourlyEmployee hourlyEmployee=new HourlyEmployee(456,"Kiran",0);
        hourlyEmployee.calculatePay(3);
        hourlyEmployee.displayDetails();

        System.out.println("**********************************************");

        SalariedEmployee salariedEmployee1=new SalariedEmployee(789,"Subbu",0);
        salariedEmployee1.calculatePay(30);
        salariedEmployee1.displayDetails();
        System.out.println("=================");

        HourlyEmployee hourlyEmployee1=new HourlyEmployee(1122,"Krishna",0);
        hourlyEmployee1.calculatePay(9);
        hourlyEmployee1.displayDetails();
    }
}
