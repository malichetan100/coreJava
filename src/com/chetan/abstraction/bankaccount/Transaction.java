package com.chetan.abstraction.bankaccount;

public class Transaction extends Account{
    @Override
    public void depositeAmount(double amount) {
        currentAmount=currentAmount+amount;
        System.out.println("Amount deposited successfully!!!" +
                "and current balance is: "+currentAmount);
    }

    @Override
    public void withdrawAmount(double amount) {
        currentAmount = currentAmount - amount;
        System.out.println("Amount deposited successfully!!!" +
                "and current balance is: " + currentAmount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance is: "+currentAmount);
    }
}
