package com.pluralsight;

public abstract class Account {
    private String name;
    private String accountMember;
    private double balance;

    public Account(String name, String accountMember, double balance) {
        this.name = name;
        this.accountMember = accountMember;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountMember() {
        return accountMember;
    }

    public double getBalance() {
        return balance;
    }
    //public abstract double getValue();
}
