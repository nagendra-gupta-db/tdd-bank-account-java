package org.xpdojo.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();

        account.deposit(100.0);

        Assertions.assertEquals(100.0, account.balance);
    }

    @Test
    public void checkInitialBalanceIsZero() {

        Account account = new Account();

        Assertions.assertEquals(0.0, account.balance);
    }

    @Test
    public void depositAmountMultipleTimesToIncreaseTheBalance() {
        Account account = new Account();

        account.deposit(50.0);
        Assertions.assertEquals(50.0, account.balance);

        account.deposit(100.0);
        Assertions.assertEquals(150.0, account.balance);
    }

    @Test
    public void withdrawAmountToDecreaseTheBalance() {

        Account account = new Account();

        account.withdraw(50.0);

        Assertions.assertEquals(-50, account.balance);
    }
}
