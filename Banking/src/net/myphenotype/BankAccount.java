package net.myphenotype;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balanceAmount;

    public BankAccount(String firstName, String lastName, double balanceAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balanceAmount = balanceAmount;
    }

    public double depositAmount(double amount, boolean branch) throws Exception {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        balanceAmount = balanceAmount + amount;
        return balanceAmount;
    }

    public double withdrawAmount(double amount, boolean branch){
        balanceAmount = balanceAmount - amount;
        return balanceAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
}
