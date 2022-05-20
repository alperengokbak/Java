package Practice1_19.Practice8;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1, num2, sum = 0;
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter num1: ");
        num1 = input.nextDouble();
        System.out.print("Please enter num2: ");
        num2 = input.nextInt();

        System.out.println(" 1.Aggregation\n 2.Substraction\n 3.Division\n 4.Multiplication\n 5.Square Root");
        System.out.print("Select valid variable: ");
        n = input.nextInt();
        input.close();

        if(n == 1){
            sum = num1 + num2;
        }else if(n == 2){
            sum = num1 - num2;
        }else if(n == 3){
            if(num2 != 0){
                sum = num1 / num2;
            }else{
                System.out.println("Any number cannot divide zero!!!");
            }
        }else if(n == 4){
            sum = num1 * num2;
        }else if(n == 5){
            num1 = Math.sqrt(num1);
            System.out.println(num1);
        }else{
            System.out.println("Invalid number!!");
        }
        System.out.println("Result: " + sum);
    }
}
