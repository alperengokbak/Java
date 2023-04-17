package Practice20_37;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int digit, result = 0, first = 0, second = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Digit Of The Fibonacci Series: ");
        digit = input.nextInt();
        input.close();

        System.out.print(first + " " + second + " ");
        for(int i = 1; i < digit; i++){
            result = first + second;
            first = second;
            second = result;
            System.out.print(result + " ");
        }
        
    }
}
