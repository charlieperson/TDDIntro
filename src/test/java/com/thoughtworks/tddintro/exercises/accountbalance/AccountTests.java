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
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
