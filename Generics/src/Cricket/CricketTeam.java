package Cricket;

import java.util.ArrayList;
import java.util.List;

public class CricketTeam {

    private String teamName;
    private List<Cricketer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLoses = 0;
    private int totalTies = 0;

    public CricketTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMembers(Cricketer cricketer){
        if (!teamMembers.contains(cricketer)){
            teamMembers.add(cricketer);
        }
    }

    public void listTeam(){
        System.out.println(teamName + "Roaster");
        System.out.println(teamMembers);
    }

    public int getRank(){
        return (totalLoses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){

        String message = "lost to";

        if (ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLoses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return "CricketTeam{" +
                "teamName='" + teamName + '\'' +
                ", teamMembers=" + teamMembers +
                ", Ranked=" + getRank()  +
                '}';
    }
}
