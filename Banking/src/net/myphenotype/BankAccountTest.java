package net.myphenotype;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void depositAmount() {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        double balance = bankAccount.depositAmount(1000, true);
        assertEquals(6000.00, balance, 0.00);
        assertEquals(6000,bankAccount.getBalanceAmount());
    }

    @org.junit.jupiter.api.Test
    void withdrawAmount() {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalanceAmount() {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void dummyTest() {
        assertEquals(21,23);
    }

    @org.junit.jupiter.api.Test
    public void getFirstName() {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void setFirstName(String firstName) {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void getLastName() {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void setLastName(String lastName) {
        fail("This test is yet to be implemented");
    }
}