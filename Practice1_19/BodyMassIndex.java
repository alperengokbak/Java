package Practice1_19;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height(kind of meter): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight(kind of Kilogram): ");
        weight = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Here's your body weight index: " + bmi);

        input.close();
    }
}
