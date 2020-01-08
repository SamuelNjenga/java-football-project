
public class User13 {
    private int gameId,awayTeamId,homeTeamId,homeGoals,awayGoals;
    private String awayTeam,homeTeam,homeMatchHonor,awayMatchHonor;
    public User13(int gameId,String homeTeam,int homeTeamId,String awayTeam,int awayTeamId,int homeGoals,int awayGoals,String homeMatchHonor,String awayMatchHonor){
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.homeTeamId = homeTeamId;
        this.awayTeam = awayTeam;
        this.awayTeamId = awayTeamId;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.homeMatchHonor = homeMatchHonor;
        this.awayMatchHonor = awayMatchHonor;
        
    }

    public int getGameId() {
        return gameId;
    }

    public int getAwayTeamId() {
        return awayTeamId;
    }

    public int getHomeTeamId() {
        return homeTeamId;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getHomeMatchHonor() {
        return homeMatchHonor;
    }

    public String getAwayMatchHonor() {
        return awayMatchHonor;
    }
    
}
