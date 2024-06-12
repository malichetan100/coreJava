package com.chetan.Tables;

import java.util.Scanner;

public class MainMultiplicationTable {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number to multiply: ");
        int number=scr.nextInt();
        MultiplicationTable multiplicationTable=new MultiplicationTable();
        multiplicationTable.doMultiplicationTable(number);
    }
}
