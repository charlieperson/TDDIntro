package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    Account account;

    @Before
    public void setUp() {
        account = new Account();
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposit(100);
        assertThat(account.getBalance(), is(100));
        account.deposit(10);
        assertThat(account.getBalance(), is(110));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.deposit(100);
        account.withdraw(75);
        assertThat(account.getBalance(), is(25));

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.deposit(100);
        account.withdraw(150);
        assertThat(account.getBalance(), is(100));
    }
}
