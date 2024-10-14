package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shristi.exception.InsufficientFundsException;
import com.shristi.training.Bank;

class BankTest {

    private Bank bank;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
       
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
       
    }

    @BeforeEach
    void setUp() throws Exception {
        bank = new Bank(9000); // Start with 9000 to allow for a withdrawal
    }

    @AfterEach
    void tearDown() throws Exception {
        
    }

    @Test
    void testDepositSuccess() {
        double newBalance = bank.deposit(3000);
        assertEquals(12000, newBalance, "Balance should be 12000 after depositing 3000");
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bank.deposit(-500);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawSuccess() throws InsufficientFundsException {
        double newBalance = bank.withdraw(1000); // Withdraw 1000
        assertEquals(8000, newBalance, "Balance should be 8000 after withdrawing 1000.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(InsufficientFundsException.class, () -> {
            bank.withdraw(2000); // This will throw an exception
        });
        assertEquals("Cannot withdraw. Minimum balance must be 8000.", exception.getMessage());
    }

    @Test
    void testInitialBalance() {
        assertEquals(9000, bank.getBalance(), "Initial balance should be 9000");
    }

    @Test
    void testWithdrawExactMinimumBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(0); // Should throw IllegalArgumentException since 0 is not a valid amount to withdraw
        });
        assertEquals("Withdraw amount must be positive", exception.getMessage());
    }

    @Test
    void testDepositZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bank.deposit(0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }
}
