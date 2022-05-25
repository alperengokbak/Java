package Practice20_37.Practice21;

import java.util.Scanner;

public class calculateExponent {
    public static void main(String[] args) {
        int exponentOfNumber, number, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number: ");
        number = input.nextInt();
        System.out.print("Please enter exponent of number: ");
        exponentOfNumber = input.nextInt();
        input.close();

        for(int i = 1;i<=exponentOfNumber;i++){
            total *= number;
        }
        System.out.println("Totally: " + total);

    }
}
