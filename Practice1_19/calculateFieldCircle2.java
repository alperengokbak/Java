package Practice1_19;

import java.util.Scanner;

public class calculateFieldCircle2 {
    public static void main(String[] args) {
        double radius, dCenterAngle, field, 𝜋 = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter valid dimension of center angle: ");
        dCenterAngle = input.nextDouble();
        System.out.print("Enter valid radius: ");
        radius = input.nextDouble();

        field = (𝜋 * (radius*radius) * dCenterAngle) / 360;
        System.out.println("Field Of The Circle defined main radius: " + field);

        input.close();
    }
}
