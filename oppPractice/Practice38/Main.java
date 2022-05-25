package oppPractice.Practice38;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jack Daniels", "164765632", "Programming");
        Teacher t2 = new Teacher("Korhan Karabulut", "16321212", "Testing");
        Teacher t3 = new Teacher("Uras Tos", "16453213", "Data Base");

        Course programming = new Course("Se", "-2228", "Programming");
        Course testing = new Course("Se", "-2226", "Testing");
        Course dataBase = new Course("Se", "-2222", "Data Base");

        programming.addTeacher(t1);
        testing.addTeacher(t2);
        dataBase.addTeacher(t3);

        Student s1 = new Student("21654325476", "Johny Cage", "2", programming, testing, dataBase);
        Student s2 = new Student("21763214564", "Johny Depp", "4", programming, testing, dataBase);

        s1.addBulkExamNote(10, 25, 60);
        s1.addBulkVerbalNote(80, 95, 75);
        s1.calculateAverage();
        
        s2.addBulkExamNote(100, 95, 88);
        s2.addBulkVerbalNote(80, 95, 75);
        s2.calculateAverage();

    }
}