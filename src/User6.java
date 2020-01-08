
public class User6 {
    
    private int schoolNumber,numberOfPenaltyCards;
    private String schoolName;
    public User6(String schoolName,int schoolNumber,int numberOfPenaltyCards){
       this.schoolName = schoolName;
       this.schoolNumber = schoolNumber;
       this.numberOfPenaltyCards = numberOfPenaltyCards;
       
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public int getNumberOfPenaltyCards() {
        return numberOfPenaltyCards;
    }

    public String getSchoolName() {
        return schoolName;
    }
    
}
