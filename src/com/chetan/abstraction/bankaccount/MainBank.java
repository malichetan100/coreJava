package com.chetan.abstraction.bankaccount;

import java.util.Scanner;

public class MainBank{
    public static void main(String[] args) {
        double minimumBalance=500.00;

        Scanner scr=new Scanner(System.in);
        //System.out.println("Enter an choice: ");
//        int choice=scr.nextInt();
        Transaction transaction=new Transaction();
        for (int i=1;i<=3;i++)
        {
            System.out.println("\nTransaction " + i + ":");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. To Display Balance");
            System.out.println("Enter an choice: ");
            int choice=scr.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an amount to deposite: ");
                    double depAmount = scr.nextDouble();
                    transaction.depositeAmount(depAmount);
                    break;
                case 2:
                    System.out.println("Enter an amount to be withdraw: ");
                    double withdrawAmount=scr.nextDouble();
                    if(withdrawAmount>minimumBalance)
                    {
                        transaction.withdrawAmount(withdrawAmount);
                    }
                    else
                    {
                        System.out.println("Need to maintain minimum balance");
                    }
                    break;

                case 3:
                    transaction.checkBalance();
                    break;
                default:
                    System.out.println("Invalid Choice!!!!!!!!!!!");
        }



        }
    }
}
