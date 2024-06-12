package com.chetan.Inheritance.person;

public class Teacher extends Person {
    String subjectTaught;

    public Teacher(String name, int age, String subjectTaught) {
        super(name, age);
        this.subjectTaught = subjectTaught;
    }

    public void displayTeacherSubject()
    {
        System.out.println("The Teacher "+name+" takes subject is:"+subjectTaught);
    }
}
