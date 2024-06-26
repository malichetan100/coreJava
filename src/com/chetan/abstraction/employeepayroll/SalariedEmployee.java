package com.chetan.abstraction.employeepayroll;

public class SalariedEmployee extends Employee{

    int employeeId;
    String name;
    double salary;
    //double minSalaryPerHour=500.00;
    double getMinSalaryPerDay=1000.00;
    public SalariedEmployee(int employeeId, String name, double salary) {
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }
    @Override
    void calculatePay(int days) {
        if(days>0)
        {
            salary=days*getMinSalaryPerDay;
            System.out.println("The Salary of Employee is: "+salary);
        }
    }

    @Override
    void displayDetails() {
        System.out.println(" The name of Employee is "+name+" And EmployeedId is: "+employeeId);
    }
}
