
public class User4 {
    private int teamIdNumber,points,goalsFor,goalsAgainst,goaldiffrence;
    private String teamName;
    public User4(String teamName,int teamIdNumber,int goalsFor,int goalsAgainst,int points,int goaldiffrence){
        this.teamName = teamName;
        this.teamIdNumber = teamIdNumber;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goaldiffrence = goaldiffrence;
        this.points = points;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getGoaldiffrence() {
        return goaldiffrence;
    }

   

    public int getTeamIdNumber() {
        return teamIdNumber;
    }

    public int getPoints() {
        return points;
    }

    public String getTeamName() {
        return teamName;
    }
    
    
}
