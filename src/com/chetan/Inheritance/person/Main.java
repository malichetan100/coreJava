package com.chetan.Inheritance.person;

public class Main {
    public static void main(String[] args) {

        Student student=new Student("Chetan",25,123);
        student.displayPersondetails();
        student.displayStudentId();

        Student student1=new Student("Kiran",21,333);
        student1.displayPersondetails();
        student1.displayStudentId();

        Teacher teacher=new Teacher("Salim",17,"Python");
        teacher.displayPersondetails();
        teacher.displayTeacherSubject();

        Teacher teacher1=new Teacher("Shreyes",55,"Java");
        teacher1.displayPersondetails();
        teacher1.displayTeacherSubject();
    }

}
