public class DebitCredit {

    private float openingBalance;
    private float closingBalance;

    public DebitCredit() {
        this.openingBalance = 0.00f;
        this.closingBalance = 0.00f;
    }

    public DebitCredit(float openingBalance) {
        this.openingBalance = openingBalance;
        this.closingBalance = openingBalance;
    }

    public float getOpeningBalance() {
        return openingBalance;
    }

    public float getClosingBalance() {
        return closingBalance;
    }

    public void creditToBalance(float transactionAmount){
        this.closingBalance = this.closingBalance + transactionAmount;
    }

    public void debitFromBalance(float transactionAmount){
        this.closingBalance = this.closingBalance - transactionAmount;
    }

    public DebitCredit creditTo(float transactionAmount){
        this.closingBalance = this.closingBalance + transactionAmount;
        return this;
    }

    public DebitCredit debitFrom(float transactionAmount){
        this.closingBalance = this.closingBalance - transactionAmount;
        return this;
    }
}
