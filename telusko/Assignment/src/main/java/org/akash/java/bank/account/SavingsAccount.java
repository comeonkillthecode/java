package org.akash.java.bank.account;

public class SavingsAccount extends BankAccount{
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Deposit should be greater then 0");
        }
        this.balance += amount;
        System.out.println("Deposited: "+  amount);
    }

    @Override
    public void withDrawl (double amount) {
        if(amount <= 0 || amount > this.balance){
            throw new IllegalArgumentException("Invalid with-drawl amount.");
        }
        this.balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + this.balance);
    }

    public void addInterest() {
        balance = balance * (1+INTEREST_RATE);
        System.out.println("Interest Added");
    }
}
