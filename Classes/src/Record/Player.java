package Record;

public class Player {

    private String name;
    private String team;
    private String position;

    public Player(String name, String team, String position) {
        this.name = name;
        this.team = team;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
