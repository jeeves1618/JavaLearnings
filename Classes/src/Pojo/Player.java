package Pojo;

public class Player {

    private String name;
    private String team;
    private String position;

    public Player(String name, String team, String position) {
        this.name = name;
        this.team = team;
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
