public class Player {
    private String playerName;
    private String nationalTeam;
    private String playerType;
    private int oneDayMatchesPlayed;
    private int testMatchesPlayed;
    private int t20MatchesPlayed;

    public String getPlayerName() {
        return playerName;
    }

    public Player setPlayerName(String playerName) {
        this.playerName = playerName;
        return this;
    }

    public String getNationalTeam() {
        return nationalTeam;
    }

    public Player setNationalTeam(String nationalTeam) {
        this.nationalTeam = nationalTeam;
        return this;
    }

    public String getPlayerType() {
        return playerType;
    }

    public Player setPlayerType(String playerType) {
        this.playerType = playerType;
        return this;
    }

    public int getOneDayMatchesPlayed() {
        return oneDayMatchesPlayed;
    }

    public Player setOneDayMatchesPlayed(int oneDayMatchesPlayed) {
        this.oneDayMatchesPlayed = oneDayMatchesPlayed;
        return this;
    }

    public int getTestMatchesPlayed() {
        return testMatchesPlayed;
    }

    public Player setTestMatchesPlayed(int testMatchesPlayed) {
        this.testMatchesPlayed = testMatchesPlayed;
        return this;
    }

    public int getT20MatchesPlayed() {
        return t20MatchesPlayed;
    }

    public Player setT20MatchesPlayed(int t20MatchesPlayed) {
        this.t20MatchesPlayed = t20MatchesPlayed;
        return this;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", nationalTeam='" + nationalTeam + '\'' +
                ", playerType='" + playerType + '\'' +
                ", oneDayMatchesPlayed=" + oneDayMatchesPlayed +
                ", testMatchesPlayed=" + testMatchesPlayed +
                ", t20MatchesPlayed=" + t20MatchesPlayed +
                '}';
    }
}
