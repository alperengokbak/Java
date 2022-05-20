package Practice1_19.Practice3;

import java.util.Scanner;

public class findhypotenuse {
    public static void main(String[] args) {

        int longEdge1, longEdge2;
        double hypotenuse, fieldFormula;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter First Edge: ");
        longEdge1 = input.nextInt();

        System.out.print("Now, Enter Second Edge: ");
        longEdge2 = input.nextInt();

        input.close();

        hypotenuse = (longEdge1*longEdge1) + (longEdge2*longEdge2);
        System.out.println("Square Of Hypotenuse:" + Math.sqrt(hypotenuse));

        fieldFormula = (longEdge1*longEdge2)/2;
        System.out.println("Field Of Right Triangle" + fieldFormula);
    }
}
