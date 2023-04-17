package OopPractice.CalculateTheSalary;

public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;
    int currentYear;

    public Employee(String fullName, double salary, int workHours, int hireYear, int currentYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.currentYear = currentYear;
    }

    public void print(){
        System.out.println("Name And Surname: " + this.fullName);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working Hours(Per Month): " + this.workHours);
        System.out.println("Starting To Hire Year:" + hireYear);
        System.out.println("Tax: " + tax(this.salary));
        System.out.println("Bonus: " + bonus(this.salary));
        System.out.println("Interest: " + interest(this.salary));
        System.out.println("Adding Tax And Bonus: " + totallySal(this.salary));
        System.out.println("Starting Salary Next Month: " + (this.salary + interest(this.salary)));

    }

    public double tax(double sal){
        double amountTax = 0.05;
        return sal * amountTax;
    }
    public double bonus(double sal){
        double bonus = 1.3;

        if(this.workHours > 200){
            return (sal * bonus) - sal;
        }
        return 0;
    }
    public double interest(double sal){
        if(this.currentYear - this.hireYear > 3){
            return sal * 0.1;
        }else if(this.currentYear - this.hireYear > 5){
            return sal * 0.12;
        }else if(this.currentYear - this.hireYear > 10){
            return sal * 0.15;
        }
        return 0;
    }
    public double totallySal(double sal){
        return sal - tax(this.salary) + bonus(this.salary); 
    }
}
