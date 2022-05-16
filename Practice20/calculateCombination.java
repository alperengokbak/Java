package Practice20;

import java.util.Scanner;

public class calculateCombination {

    static void combination(int x, int y){
        int comb = fact(x) / (fact(y) * fact(x-y));
        System.out.println("Combination: " + comb);
    }

    static int fact(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number for Combination: ");
        number = input.nextInt();
        System.out.print("Enter second number for Combination: ");
        number2 = input.nextInt();
        input.close();

        combination(number, number2);
    } 
}
