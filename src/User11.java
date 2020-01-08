
public class User11 {
    private String teamName;
    private int teamId,points,goalDiff;
    public User11(String teamName,int teamId,int points,int goalDiff){
        this.teamName = teamName;
        this.teamId = teamId;
        this.points = points;
        this.goalDiff = goalDiff;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalDiff() {
        return goalDiff;
    }
    
}
