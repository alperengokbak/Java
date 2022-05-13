package Practice3;

import java.util.Scanner;

public class findFieldTriangle {
    public static void main(String[] args) {
        int edge1, edge2, edge3;
        double fieldTriangle, u, areaTriangle;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Edge: ");
        edge1 = input.nextInt();

        System.out.print("Enter Second Edge: ");
        edge2 = input.nextInt();

        System.out.print("Enter Third Edge: ");
        edge3 = input.nextInt();

        u = (edge1+edge2+edge3) / 2;
        areaTriangle = 2*u ;
        fieldTriangle = u * (u - edge1)* (u - edge2) * (u - edge3);
        System.out.println("Area Of Triangle: " + areaTriangle);
        System.out.println("Field Of Triangle: " + Math.sqrt(fieldTriangle));
    }
}
