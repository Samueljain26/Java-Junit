package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void shouldCheckBalance(){
        BankAccount.deposit(2000);
        BankAccount.deposit(1000);
        BankAccount.withdraw(500);
       double result = BankAccount.getBalance();
        Assertions.assertEquals(2500,result);
    }
    @Test
    public void shouldCheckFailWithdrawals(){
        BankAccount.deposit(2000);
        boolean result = BankAccount.withdraw(3000);
        Assertions.assertFalse(result);
    }
}
