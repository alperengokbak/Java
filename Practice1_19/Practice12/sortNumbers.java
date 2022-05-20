package Practice1_19.Practice12;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers.");
        System.out.print("First: ");
        number1 = input.nextInt();
        System.out.print("Second: ");
        number2 = input.nextInt();
        System.out.print("Third: ");
        number3 = input.nextInt();
        input.close();

        System.out.println("Bigger to Smaller");

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println(number1 + " > " + number2 + " > " + number3);
            }else{
                System.out.println(number1 + " > " + number3 + " > " + number2);
            }
        }else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println(number2 + " > " + number1 + " > " + number3);
            }else{
                System.out.println(number2 + " > " + number3 + " > " + number1);
            }
        }else if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.println(number3 + " > " + number1 + " > " + number2);
            }else{
                System.out.println(number3 + " > " + number2 + " > " + number1);
            }
        }else {
            System.out.println(number3 + " = " + number1 + " = " + number2);
        }

        System.out.println("Smaller to Bigger");

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println(number3 + " < " + number2 + " < " + number1);
            }else{
                System.out.println(number2 + " < " + number3 + " < " + number1);
            }
        }else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println(number3 + " < " + number1 + " < " + number2);
            }else{
                System.out.println(number1 + " < " + number3 + " < " + number2);
            }
        }else if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.println(number2 + " < " + number1 + " < " + number3);
            }else{
                System.out.println(number1 + " < " + number2 + " < " + number3);
            }
        }
    }
}
