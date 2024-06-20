package com.chetan.Encapsulation;

public class Student {
    private int rollNumber;
    private String firstName;
    private String lastName;

    public Student()
    {

    }

    public int getRollNumber() {
            return rollNumber;

    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
