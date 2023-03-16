public class CalculateSavings {

    private float totalMonthlyIncome;
    private float totalMonthlyExpenses;

    public float computeSavings(float expense, float ...incomes){
        this.totalMonthlyExpenses = expense;
        for(float income: incomes){
            this.totalMonthlyIncome = this.totalMonthlyIncome + income;
        }
        return totalMonthlyIncome - totalMonthlyExpenses;
    }


}
