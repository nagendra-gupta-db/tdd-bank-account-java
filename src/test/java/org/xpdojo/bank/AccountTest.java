package org.xpdojo.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
        account.deposit(100.0);
        account.withdraw(50.0);

        Assertions.assertEquals(50.0, account.balance);
    }

    @Test
    public void withdrawAmountToDecreaseTheBalanceBelowZero() {

        Account account = new Account();
        assertThatThrownBy(() -> account.withdraw(50.0)).isInstanceOf(IllegalArgumentException.class).hasMessage("Balance cannot be negative after withdraw.");

    }

    @Test
    public void transferAmountWithSufficientBalance() {

        Account sender = new Account();

        sender.deposit(100.0);

        Assertions.assertEquals(100.0, sender.balance);

        Account receiver = new Account();
        sender.transfer(receiver, 50.0);

        Assertions.assertEquals(50.0, receiver.balance);

    }
}
