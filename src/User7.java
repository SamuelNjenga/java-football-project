
public class User7 {
     private int refereeId,schoolId;
    private String belongingSchool,refereeName,gender,email;
    
    
    
    public User7(int refereeId,String refereeName,String belongingSchool,int schoolId,String email,String gender){
this.refereeId = refereeId;
this.refereeName = refereeName;
this.belongingSchool = belongingSchool;
this.schoolId = schoolId;
this.email = email;
this.gender = gender;
    }

    public int getRefereeId() {
        return refereeId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public String getBelongingSchool() {
        return belongingSchool;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
    
}
