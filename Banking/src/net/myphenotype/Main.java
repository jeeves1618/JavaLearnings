package net.myphenotype;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Your bank account is exploding with money!");

        BankAccount bankAccount = new BankAccount("Barack", "Obama", 5000);
        System.out.println(bankAccount.getLastName().getClass().toString());

    }
}
