package org.xpdojo.bank;

public class Account {


    public Double balance = 0.0;

    public void deposit(double deposit) {

        balance += deposit;
    }

    public void withdraw(double withdraw) throws IllegalArgumentException {

        balance -= withdraw;
    }
}
