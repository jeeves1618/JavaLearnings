package Cricket;

record Cricketer(String name, String playingRole , Integer runsScored, Integer wicketsTaken){}

public class Main {

    public static void main(String[] args) {

        CricketTeam madrasSoulShakers = new CricketTeam("Madras Soul Shakers");
        CricketTeam calcuttaCatCatchers = new CricketTeam("Calcutta Cat Catchers");

        matchResults(madrasSoulShakers, 183, calcuttaCatCatchers, 145);
    }

    public static void matchResults(CricketTeam team1, int t1Score, CricketTeam team2, int t2Score){
        String message1 = team1.setScore(t1Score, t2Score);
        String message2 = team2.setScore(t2Score, t1Score);
        System.out.printf("%s %s %s",team1, message1, team2);
    }
}

