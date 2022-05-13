package Practice5;

import java.util.Scanner;

public class calculateFieldCircle {
    public static void main(String[] args) {
        double radius, field, area, 𝜋 = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter valid radius: ");
        radius = input.nextDouble();

        field = 𝜋* radius* radius;
        area = 2* 𝜋* radius;

        System.out.println("Field Of Circle: " + field);
        System.out.println("Area Of Circle: " + area);

        input.close();
    }
}
