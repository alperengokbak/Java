package Practice1_19.Practice7;

import java.util.Scanner;

public class groceryProgram {
    public static void main(String[] args) {
        double kgPear, kgApple, kgTomato, kgBanana, kgEggplant, total;
        double pearCost = 2.14, appleCost = 3.67, tomatoCost = 1.11, bananaCost = 0.95, eggplantCost = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("How many kilograms of pear ? :");
        kgPear = input.nextDouble();

        System.out.print("How many kilograms of apple ? :");
        kgApple = input.nextDouble();

        System.out.print("How many kilograms of tomato ? :");
        kgTomato = input.nextDouble();

        System.out.print("How many kilograms of banana ? :");
        kgBanana = input.nextDouble();

        System.out.print("How many kilograms of eggplant ? :");
        kgEggplant = input.nextDouble();

        total = (kgPear*pearCost) + (kgApple*appleCost) + (kgTomato*tomatoCost) + (kgBanana*bananaCost) + (kgEggplant*eggplantCost);
        System.out.println("Totally cost: " + total + " Dollars");

        input.close();
    }
}
