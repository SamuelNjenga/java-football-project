
class User {
    
    private int GameIdnumber,refereeIdNumber;
    private String HomeTeam,AwayTeam,refereeName,refereeSchool,matchDate,stadeName;
    
    
    public User(int GameIdnumber,String HomeTeam,String AwayTeam,int refereeIdNumber,String refereeName,String refereeSchool,String matchDate,String stadeName)
    {
        this.GameIdnumber = GameIdnumber;
        this.HomeTeam = HomeTeam;
        this.AwayTeam = AwayTeam;
        this.refereeIdNumber = refereeIdNumber;
        this.refereeName = refereeName;
        this.refereeSchool = refereeSchool;
        this.matchDate = matchDate;
        this.stadeName = stadeName;
    }

    public int getGameIdnumber() {
        return GameIdnumber;
    }

    public String getHomeTeam() {
        return HomeTeam;
    }

    public String getAwayTeam() {
        return AwayTeam;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public int getRefereeIdNumber() {
        return refereeIdNumber;
    }

    public String getRefereeSchool() {
        return refereeSchool;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public String getStadeName() {
        return stadeName;
    }
    

   
    
    
}
