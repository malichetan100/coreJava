package com.chetan.abstraction.employeepayroll;

public abstract class Employee {
//    private int employeeId;
//    private String name;
//    private double salary;
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    abstract void calculatePay(int hours);
    abstract  void displayDetails();
}

