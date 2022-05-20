package Practice4;

import java.util.Scanner;

public class CalculateTaxiMetres {
    public static void main(String[] args) {
        double distanceKm, totalWage, perKm = 2.20, beginningWage = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance type of Km: ");
        distanceKm = input.nextDouble();

        input.close();

        totalWage = (distanceKm * perKm) + beginningWage;
        System.out.println("Your total fee: " + totalWage);

        totalWage = (totalWage < 20) ? 20 : totalWage;     // You must pay 20 even if the minimum wage is less than 20..
        System.out.println("Totally: " + totalWage);
    }
}
