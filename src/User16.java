
public class User16 {
    
    
    private String playerName,teamName,playerPosition;
    private int playerId,numberOfGoals;
    
    public User16(int playerId,String playerName,String teamName,int numberOfGoals,String playerPosition)
          {
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamName = teamName;
        this.numberOfGoals = numberOfGoals;
        this.playerPosition = playerPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }
    
    
    
}
