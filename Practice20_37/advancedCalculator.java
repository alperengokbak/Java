package Practice20_37;

import java.util.Scanner;

public class advancedCalculator {

    private static void menu(){
        System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Power\n6: Factorial\n7: Modal\n8: FieldAndPerimeter\n0: Exit");
    }

    static void addition(){
        int number, result = 0, i = 1;
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Number " + i++ + ": ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void subtraction(){
        int number, result = 0, i = 1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Number " + i++ + ": ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result -= number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void multiplication(){
        int number, result = 1, i = 1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Number " + i++ + ": ");
            number = input.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            if (number == 1) {
                break;
            }
            result *= number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void division(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you entry: ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + ": ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Any number cannot divide by zero.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void power(){
        int base, exponent, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        base = input.nextInt();
        System.out.print("Enter exponent of number: ");
        exponent = input.nextInt();

        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void factorial(){
        int number, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to calculate factorial: ");
        number = input.nextInt();

        for(int i = number; i > 0; i--){
            result *= i;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void modal(){
        int number, divisior, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        System.out.print("Enter a divisior: ");
        divisior = input.nextInt();

        result = number % divisior;
        System.out.println();
        System.out.println("Result: " + result);
    }
    static void fieldAndPerimeter(){
        int shortEdge, longEdge, perimeter = 0, field = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Short edge of rectangle: ");
        shortEdge = input.nextInt();
        System.out.print("Long edge of rectangle: ");
        longEdge = input.nextInt();

        field = shortEdge * longEdge;
        perimeter = 2*(shortEdge + longEdge);
        System.out.println();
        System.out.println("Perimeter: " + perimeter + "\nField: " + field);
    }
    public static void main(String[] args) {
        int selection;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println();
            menu();
            System.out.print("Choose a process: ");
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modal();
                    break;
                case 8:
                    fieldAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection, please choose valid variable!!!");
                    break;
            }
        } while (selection != 0);
        input.close();
    }
}
