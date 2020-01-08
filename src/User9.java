
public class User9 {
        private int schoolTeamId;
    private String regDate,schoolTeamName;
    float regFees;
    
    
    
    public User9(String schoolTeamName,int schoolTeamId,String regDate,float regFees){
     this.schoolTeamName = schoolTeamName;
     this.schoolTeamId = schoolTeamId;
     this.regDate = regDate;
     this.regFees = regFees;
    }

    public int getSchoolTeamId() {
        return schoolTeamId;
    }

    public String getRegDate() {
        return regDate;
    }

    public String getSchoolTeamName() {
        return schoolTeamName;
    }

    public float getRegFees() {
        return regFees;
    }
    
    
}
