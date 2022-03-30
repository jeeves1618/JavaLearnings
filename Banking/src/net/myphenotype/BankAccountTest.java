package net.myphenotype;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.BeforeAll
    public static void iWantThisToBeDoneInTheBeggining() {
        System.out.println("Before Everything");
    }

    @org.junit.jupiter.api.Test
    void depositAmount() throws Exception {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        double balance = bankAccount.depositAmount(1000, true);
        assertEquals(7000.00, balance, 0.00,"The deposit is not incrementing the balance accurately");
    }

    @org.junit.jupiter.api.Test
    void withdrawAmount() {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        double balance = bankAccount.withdrawAmount(1000, true);
        assertEquals(4000, balance, 0.00);
    }

    @org.junit.jupiter.api.Test
    void getBalanceAmount_deposit() throws Exception {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        double balance = bankAccount.depositAmount(1000, true);
        assertEquals(6000.00, balance, 0.00);
        assertEquals(6000,bankAccount.getBalanceAmount());
    }

    @org.junit.jupiter.api.Test
    void getBalanceAmount_withdraw() {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        double balance = bankAccount.withdrawAmount(1000, true);
        assertEquals(4000, balance, 0.00);
        assertEquals(4000,bankAccount.getBalanceAmount());
    }

    @org.junit.jupiter.api.Test
    public void dummyTest() {
        assertEquals(21,23, 3);
    }

    @org.junit.jupiter.api.Test
    public void getFirstName() {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        assertFalse(bankAccount.getFirstName().isBlank());
    }

    @org.junit.jupiter.api.Test
    public void setFirstName() {

    }

    @org.junit.jupiter.api.Test
    public void getLastName_incorrectTest() {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        assertEquals(bankAccount.getLastName().getClass(),"class java.lang.String");
    }
    @org.junit.jupiter.api.Test
    public void getLastName_correctTest() {
        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        assertTrue(bankAccount.getLastName().getClass().toString().equals("class java.lang.String"));
    }

    @org.junit.jupiter.api.Test
    public void setLastName() {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.AfterAll
    public static void iWantThisToBeDoneInTheEnd() {
        System.out.println("After Everything");
    }
}