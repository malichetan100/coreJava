package com.chetan.Inheritance.person;

public class Student extends Person{
    int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void displayStudentId()
    {
        System.out.println("The student "+name+"'s id is:"+studentId);
    }
}
