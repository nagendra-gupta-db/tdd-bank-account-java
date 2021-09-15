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
}
