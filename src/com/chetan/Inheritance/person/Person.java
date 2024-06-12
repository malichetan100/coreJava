package com.chetan.Inheritance.person;

public class Person {
    String name;
    int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void displayPersondetails()
    {
        System.out.println("The Person name is: "+name+" and their age is: "+age);
    }
}
