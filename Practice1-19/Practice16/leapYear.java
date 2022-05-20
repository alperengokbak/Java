package Practice16;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year, isLeap;
        String leap = "This year is leap year";
        String notLeap = "This year is not leap year!!";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = input.nextInt();
        input.close();

        if(year > 0){
            isLeap = year % 4;
            if(isLeap == 0){
                isLeap = year % 100;
                if(isLeap == 0){
                    isLeap = year % 400;
                    if(isLeap == 0){
                        System.out.println(leap);
                    }else{
                        System.out.println(notLeap);
                    }
                }else{
                    System.out.println(leap);
                }
            }else{
                System.out.println(notLeap);
            }
        }else{
            System.out.println("Invalid year...");
        }
    }
}
