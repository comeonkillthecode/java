package org.akash.java.bank.account;

public class CurrentAccount extends  BankAccount{
    private static final double OVERDRAFT_AMOUNT = 500;

    public CurrentAccount(double initialBalance) {
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
    public void withDrawl(double amount) throws IllegalArgumentException{
        if(amount <= 0 || amount > this.balance + OVERDRAFT_AMOUNT){
            throw new IllegalArgumentException("Invalid with-drawl amount. OverDraft limit exceeded");
        }
        this.balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + this.balance);
    }
}
