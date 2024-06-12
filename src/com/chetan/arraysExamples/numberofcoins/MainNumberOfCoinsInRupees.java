package com.chetan.arraysExamples.numberofcoins;

import java.util.Scanner;

public class MainNumberOfCoinsInRupees {
    public static void main(String[] args) {
        int note[]={1,2,5,10,20,50,100,200,500,2000};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an amount");
        int amount=scanner.nextInt();
        NumberOfCoinsInRupees numberOfCoinsInRupees=new NumberOfCoinsInRupees();
       int resNotes= numberOfCoinsInRupees.getNumberOfnotes(note,amount);
        System.out.println(resNotes);
    }
}
