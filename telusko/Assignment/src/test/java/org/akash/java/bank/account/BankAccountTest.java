package org.akash.java.bank.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;

    @BeforeEach
    void setUp() {
        savingsAccount = new SavingsAccount(1000);
        currentAccount = new CurrentAccount(1000);
    }

    @Test
    void testSavingsAccountDeposit() {
        savingsAccount.deposit(500);
        assertEquals(1500, savingsAccount.balance, 0.01);
    }

    @Test
    void testSavingsAccountDepositNegativeAmount() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            savingsAccount.deposit(-500);
        });
        assertEquals("Deposit should be greater then 0", thrown.getMessage());
    }

    @Test
    void testSavingsAccountWithdrawal() {
        savingsAccount.withDrawl(500);
        assertEquals(500, savingsAccount.balance, 0.01);
    }

    @Test
    void testSavingsAccountWithdrawalInvalidAmount() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            savingsAccount.withDrawl(1500);
        });
        assertEquals("Invalid with-drawl amount.", thrown.getMessage());
    }

    @Test
    void testSavingsAccountWithdrawalZeroAmount() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            savingsAccount.withDrawl(0);
        });
        assertEquals("Invalid with-drawl amount.", thrown.getMessage());
    }

    @Test
    void testSavingsAccountAddInterest() {
        savingsAccount.addInterest();
        assertEquals(1050, savingsAccount.balance, 0.01);
    }

    @Test
    void testCurrentAccountDeposit() {
        currentAccount.deposit(500);
        assertEquals(1500, currentAccount.balance, 0.01);
    }

    @Test
    void testCurrentAccountDepositNegativeAmount() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            currentAccount.deposit(-500);
        });
        assertEquals("Deposit should be greater then 0", thrown.getMessage());
    }

    @Test
    void testCurrentAccountWithdrawalWithinLimit() {
        System.out.println(currentAccount.balance);
        currentAccount.withDrawl(1200);
        assertEquals(-200, currentAccount.balance);
    }

    @Test
    void testCurrentAccountWithdrawalOverLimit() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            currentAccount.withDrawl(1600);
        });
        assertEquals("Invalid with-drawl amount. OverDraft limit exceeded", thrown.getMessage());
    }

    @Test
    void testCurrentAccountWithdrawalZeroAmount() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            currentAccount.withDrawl(0);
        });
        assertEquals("Invalid with-drawl amount. OverDraft limit exceeded", thrown.getMessage());
    }

    @Test
    void testCurrentAccountDisplayBalance() {
        currentAccount.displayBalance();
    }

    @Test
    void testSavingsAccountDisplayBalance() {
        savingsAccount.displayBalance();
    }
}
