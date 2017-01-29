package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int balance = 0;

    public void deposit(int amount) {
        balance = amount;
    }

    public int getBalance() {
        return balance;
    }
}
