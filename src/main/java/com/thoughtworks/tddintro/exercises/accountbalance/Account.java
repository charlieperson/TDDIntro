package com.thoughtworks.tddintro.exercises.accountbalance;

import java.io.PrintStream;

public class Account {
    int balance = 0;

    public void deposit(int amount) {
        balance = amount;
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds- withdrawal unsuccessful");
        } else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
