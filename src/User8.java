
public class User8 {
       private int coachId,schoolId;
    private String coachingSchool,coachName,gender,email;
    
    
    
    public User8(String coachName,int coachId,String coachingSchool,int schoolId,String email,String gender){
this.coachName = coachName;
this.coachId = coachId;
this.coachingSchool = coachingSchool;
this.schoolId = schoolId;
this.email = email;
this.gender = gender;
    }

    public int getCoachId() {
        return coachId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public String getCoachingSchool() {
        return coachingSchool;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
    
}
