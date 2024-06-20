package com.chetan.Encapsulation;

public class MainBankAccount {
    public static void main(String[] args) throws IllegalAccessException {
        BankAccount bankAccount=new BankAccount();

        bankAccount.setAccountNumber("55440012120001");
        bankAccount.setOwnerName("Chetan Mali");
        bankAccount.setBalance(2000.00);

        System.out.println(bankAccount.getAccountNumber()+" "+bankAccount.getOwnerName()+" "+bankAccount.getBalance());

        BankAccount bankAccount1=new BankAccount();
        bankAccount1.setAccountNumber("5004001002321");
        bankAccount1.setOwnerName("Kiran Mali");
        bankAccount1.setBalance(0);

        System.out.println(bankAccount1.getAccountNumber()+" "+bankAccount1.getOwnerName()+" "+bankAccount1.getBalance());

    }
}
