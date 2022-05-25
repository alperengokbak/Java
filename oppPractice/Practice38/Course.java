package oppPractice.Practice38;

public class Course {
    Teacher teacher;
    String code;
    String postfix;
    String name;
    double note;
    double verbalNote;
    
    public Course(String code, String postfix, String name) {
        this.code = code;
        this.postfix = postfix;
        this.name = name;
        this.note = 0.0;
        this.verbalNote = 0.0;
    }
    
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.name)){
            this.teacher = teacher;
            System.out.println("This " + teacher + " added this course.");

        }else{
            System.out.println("The teacher's prefix and course's section is not matching!!");
        }
    }
    void printTeacher(){
        this.teacher.printInfo();
    }
}
