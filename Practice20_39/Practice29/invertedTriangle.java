package Practice20_39.Practice29;

import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;

        System.out.print("Enter valid a row value: ");
        row = input.nextInt();
        input.close();

        for (int i = row; i > 0; i--) {
            for (int j = (row - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i)-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
