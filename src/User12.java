
public class User12 {
    private int teamIdNumber,points;
    private String teamName;
    
    public User12(String teamName,int teamIdNumber,int points){
        this.teamName = teamName;
        this.teamIdNumber = teamIdNumber;
        this.points = points;
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
