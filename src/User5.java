
public class User5 {
    private int playerIdNumber,schoolNumber,numberOfGoals,numberOfPenaltyCards;
    private String playerName,schoolName,playerEmailAddress,playerPosition;
    public User5(int playerIdNumber,String playerName,int schoolNumber,String schoolName,int numberOfGoals,int numberOfPenaltyCards,String playerEmailAddress,String playerPosition){
        
        this.playerIdNumber = playerIdNumber;
        this.playerName = playerName;
        this.schoolNumber = schoolNumber;
        this.schoolName = schoolName;
        this.numberOfGoals = numberOfGoals;
        this.numberOfPenaltyCards = numberOfPenaltyCards;
        this.playerEmailAddress = playerEmailAddress;
        this.playerPosition = playerPosition;
        
        
    }

    public int getPlayerIdNumber() {
        return playerIdNumber;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public int getNumberOfPenaltyCards() {
        return numberOfPenaltyCards;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getPlayerEmailAddress() {
        return playerEmailAddress;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

   
    
    
    
}
