package Practice20_37;

import java.util.Scanner;

public class FindHarmonicSeries {
    public static void main(String[] args) {
        double number;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Valid Number: ");
        number = input.nextInt();
        input.close();

        while(number > 0){
            result += (1 / number);
            number--;
            System.out.println("Harmonic Numbers: " + result);
        }
        System.out.println("Harmonic Sersies Of Result: " + result);
    }
}
