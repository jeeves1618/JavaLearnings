public class CalculateTakeHome {

    private float grossAnnualSalary;
    private float taxRate;
    private float monthlyTakeHome;

    public CalculateTakeHome() {
        System.out.println("Object without argument created");
    }

    public CalculateTakeHome(float grossAnnualSalary, float taxRate) {
        System.out.println("Object with two arguments created");
        this.grossAnnualSalary = grossAnnualSalary;
        this.taxRate = taxRate;
        this.calcTakeHome();
    }

    public void setGrossAnnualSalary(float grossAnnualSalary) {
        this.grossAnnualSalary = grossAnnualSalary;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public float getMonthlyTakeHome() {
        return this.monthlyTakeHome;
    }

    private void calcTakeHome(){
        this.monthlyTakeHome = (this.grossAnnualSalary / 12) * (1 - this.taxRate/100);
    }
}
