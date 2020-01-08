
public class User1 {
    
    private int schoolNumber,schoolTeacherIdNumber;
    private String schoolName,schoolTeacher,schoolEmail,regDate;
    private float regFees;
    
    
    public User1(String schoolName,int schoolNumber,String schoolTeacher,int schoolTeacherIdNumber,String schoolEmail,String regDate,float regFees){
        this.schoolName = schoolName;
        this.schoolNumber = schoolNumber;
        this.schoolTeacher = schoolTeacher;
        this.schoolTeacherIdNumber = schoolTeacherIdNumber;
        this.schoolEmail = schoolEmail;
        this.regDate = regDate;
        this.regFees = regFees;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public int getSchoolTeacherIdNumber() {
        return schoolTeacherIdNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolTeacher() {
        return schoolTeacher;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public String getRegDate() {
        return regDate;
    }

    public float getRegFees() {
        return regFees;
    }
    
    
}
