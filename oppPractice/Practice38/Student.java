package oppPractice.Practice38;

public class Student {
    Course programming;
    Course testing;
    Course dataBase;
    String studentNo;
    String fullName;
    String classes;
    double totalAverage;
    boolean isPass;
    
    public Student(String studentNo, String fullName, String classes, Course programming, Course testing, Course dataBase) {
        this.studentNo = studentNo;
        this.fullName = fullName;
        this.classes = classes;
        this.isPass = false;
        this.programming = programming;
        this.testing = testing;
        this.dataBase = dataBase;
    }

    void addBulkExamNote(double programming, double testing, double dataBase){
        if(programming >= 0 && programming <= 100){
            this.programming.note = programming;
        }
        if(testing >= 0 && testing <= 100){
            this.testing.note = testing;
        }
        if(dataBase >= 0 && dataBase <= 100){
            this.dataBase.note = dataBase;
        }
    }

    void addBulkVerbalNote(double verbalprogramming, double verbalTesting, double verbalDataBase){
        if(verbalprogramming >= 0 && verbalprogramming <= 100){
            this.programming.verbalNote = verbalprogramming;
        }
        if(verbalTesting >= 0 && verbalTesting <= 100){
            this.testing.verbalNote = verbalTesting;
        }
        if(verbalDataBase >= 0 && verbalDataBase <= 100){
            this.dataBase.verbalNote = verbalDataBase;
        }
    }

    void calculateAverage(){
        this.totalAverage = ((this.programming.note * 0.8 + this.programming.verbalNote * 0.2) + (this.testing.note * 0.8 + this.testing.verbalNote * 0.2) + (this.dataBase.note * 0.8 + this.dataBase.verbalNote * 0.2)) / 3;
        printNote();
        isPass();
    }
    boolean isPass(){
        if(this.totalAverage >= 50){
            System.out.println("Passed!");
            return true;
        }else{
            System.out.println("Flunked!!");
            return false;
        }
    }
    void printNote(){
        System.out.println("--------------");
        System.out.println(this.programming.name + " note's: " + this.programming.note);
        System.out.println(this.programming.name + " verbal note's: " + this.programming.verbalNote);
        System.out.println();
        System.out.println(this.testing.name + " note's: " + this.testing.note);
        System.out.println(this.testing.name + " verbal note's: " + this.programming.verbalNote);
        System.out.println();
        System.out.println(this.dataBase.name + " note's: " + this.dataBase.note);
        System.out.println(this.dataBase.name + " verbal note's: " + this.programming.verbalNote);
        System.out.println();
        System.out.println("Average: " + this.totalAverage);
    }
}

