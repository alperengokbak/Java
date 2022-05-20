package Practice8;

import java.util.Scanner;

public class calculatorBySwitch {
    public static void main(String[] args) {
        double num1, num2;
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter num1: ");
        num1 = input.nextDouble();
        System.out.print("Please enter num2: ");
        num2 = input.nextInt();

        System.out.println(" 1.Aggregation\n 2.Substraction\n 3.Division\n 4.Multiplication");
        System.out.print("Select valid variable: ");
        n = input.nextInt();
        input.close();

        switch (n) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                if(num2 != 0){
                    System.out.println("Result: " + (num1 / num2));
                }else{
                    System.out.println("Any number cannot divide zero!!!");
                }
                break;
            case 4:
                System.out.println("Result: " + (num1 * num2));
                break;
            default:
                System.out.println("Invalid variable !!");
        }
    }
}
