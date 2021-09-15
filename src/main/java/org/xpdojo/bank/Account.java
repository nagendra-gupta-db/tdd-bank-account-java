package org.xpdojo.bank;

public class Account {


    public Double balance = 0.0;

    public void deposit(double deposit) {

        balance += deposit;
    }

    public void withdraw(double withdraw) throws IllegalArgumentException {
        double balanceAfterWithdraw = balance - withdraw;
        if( balanceAfterWithdraw < 0 ) {
            throw new IllegalArgumentException("Balance cannot be negative after withdraw.");
        }
        balance -= withdraw;
    }
}
