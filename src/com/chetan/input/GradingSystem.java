package com.chetan.input;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        int marks1;
        int marks2;
        int marks3;

        System.out.println("Enter the marks of First subject :");
        marks1 = scr.nextInt();
        System.out.println("Enter the marks of Second subject :");
        marks2 = scr.nextInt();
        System.out.println("Enter the marks of Third subject :");
        marks3 = scr.nextInt();

        //Total Marks
        int totalMarks = marks1 + marks2 + marks3;
        System.out.println("The total marks is :" + totalMarks);

        //Average of marks
        int average = totalMarks / 3;
        System.out.println("The average of total marks is: " + average);

        if ((average >= 85) && (average <= 100)) {
            System.out.println("A");
        } else if ((average >= 70) && (average < 85)) {
            System.out.println("B");
        } else if ((average >= 55) && (average < 70)) {
            System.out.println("C");
        } else if ((average >= 35) && (average < 55)) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
