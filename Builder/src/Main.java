public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.setPlayerName("Sachin Tendulkar")
                .setNationalTeam("India")
                .setPlayerType("Batsman")
                .setOneDayMatchesPlayed(463)
                .setTestMatchesPlayed(200)
                .setT20MatchesPlayed(23)
        ;

        System.out.println(player);

        CalculateTakeHome calculateTakeHome = new CalculateTakeHome();

        CalculateTakeHome myTakeHome = new CalculateTakeHome(500000,30);
        System.out.println(myTakeHome.getMonthlyTakeHome());

        CalculateTakeHome spouseTakeHome = new CalculateTakeHome(700000,30);
        System.out.println(spouseTakeHome.getMonthlyTakeHome());

        CalculateSavings calculateSavings = new CalculateSavings();
        System.out.println(calculateSavings.computeSavings(50000.00f, myTakeHome.getMonthlyTakeHome(), spouseTakeHome.getMonthlyTakeHome()));

        /*
        1000 Cr
        2000 Dr
        1500 Cr
        1700 Dr
        2200 Cr
         */

        DebitCredit debitCredit = new DebitCredit(5000.00f);
        debitCredit.creditToBalance(1000f);
        debitCredit.debitFromBalance(2000f);
        debitCredit.creditToBalance(1500f);
        debitCredit.debitFromBalance(1700f);
        debitCredit.creditToBalance(1700f);

        System.out.println(debitCredit.getClosingBalance());

        DebitCredit account = new DebitCredit(5000.00f);
        account.creditTo(1000f)
                .debitFrom(2000f)
                .creditTo(1500f)
                .debitFrom(1700f)
                .creditTo(1700f);

        System.out.println(account.getClosingBalance());
    }
}