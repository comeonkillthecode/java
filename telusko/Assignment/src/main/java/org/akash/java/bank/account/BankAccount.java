package org.akash.java.bank.account;

public abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withDrawl(double amount);
    public abstract void displayBalance();
}
