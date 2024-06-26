package com.chetan.abstraction.employeepayroll;

public class HourlyEmployee extends Employee{
    int employeeId;
    String name;
    double salary;
    double minSalaryPerHour=500.00;
    public HourlyEmployee(int employeeId, String name, double salary) {
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }

    @Override
    void calculatePay(int hours) {
        if(hours>0)
        {
            salary=hours*minSalaryPerHour;
            System.out.println("The Salary of Employee is: "+salary);
        }
    }

    @Override
    void displayDetails() {
        System.out.println(" The name of Employee is "+name+" And EmployeedId is: "+employeeId);
    }
}
