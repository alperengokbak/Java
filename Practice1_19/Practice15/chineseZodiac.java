package Practice1_19.Practice15;

import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        int birthYear;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Year Of Birth :");
        birthYear = input.nextInt();
        input.close();

        birthYear %= 12;

        switch(birthYear){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Invalid Variable!!");
        }
    }
}
