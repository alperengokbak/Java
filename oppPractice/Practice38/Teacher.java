package oppPractice.Practice38;

public class Teacher {
    String fullName;
    String mobileNo;
    String branch;
    
    public Teacher(String fullName, String mobileNo, String branch) {
        this.fullName = fullName;
        this.mobileNo = mobileNo;
        this.branch = branch;
    }

    void teacher(){

    }
    void printInfo(){
        System.out.println("Name: " + this.fullName);
        System.out.println("Mobile Number: " + this.mobileNo);
        System.out.println("Branch: " + this.branch);
    }
}
