package com.chetan.abstraction.bankaccount;

public abstract class Account {

    //protected double minAmount=500.00;
    double currentAmount=00.00;
//    double withdrawedAmount=00.00;
//    double depositedAmount=00.00;

    abstract void depositeAmount(double amount);
    abstract void withdrawAmount(double amount);
    abstract void checkBalance();

}
