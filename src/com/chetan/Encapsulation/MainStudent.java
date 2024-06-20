package com.chetan.Encapsulation;

public class MainStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setRollNumber(20);
        student.setFirstName("Chetan");
        student.setLastName("M");

        System.out.println(student.getRollNumber()+" "+student.getFirstName()+" "+student.getLastName());

        Student student1=new Student();
        student1.setRollNumber(19);
        student1.setFirstName("Salim");
        student1.setLastName("A");
        System.out.println(student1.getRollNumber()+" "+student1.getFirstName()+" "+student1.getLastName());

        Student student2=new Student();
        student2.setRollNumber(8);
        student2.setFirstName("Subbu");
        student2.setLastName("P");
        System.out.println(student2.getRollNumber()+" "+student2.getFirstName()+" "+student2.getLastName());
    }
}
