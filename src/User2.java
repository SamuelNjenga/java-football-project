
public class User2 {
    private int teamNumber,points,teamIdNumber;
    private String teamName;
    
    
    public User2(int teamNumber,String teamName,int teamIdNumber,int points){
        this.teamNumber = teamNumber;
        this.teamName = teamName;
        this.teamIdNumber = teamIdNumber;
        this.points = points;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public int getPoints() {
        return points;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamIdNumber() {
        return teamIdNumber;
    }
    
    
}
