package com.chetan.Encapsulation;

public class BankAccount {
    private String accountNumber, ownerName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() throws IllegalAccessException {
        if(balance>0) {
            return balance;
        }
        else{
            throw new IllegalAccessException();
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
