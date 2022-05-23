package Practice20_39.Practice36;

import java.util.Scanner;

public class primeNumbersRecursive {

    private static int primeNumbersRecursivee(int number, int divisor){

    if(divisor == 1){
        return 1;
    }
    
    if(number % divisor == 0)
        return 0;
    else
        return primeNumbersRecursivee(number, divisor-1);
}
    public static void main(String[] args) {

        // If return 1, this meaning is Prime Number. Other ways, return 0 that time it's not Prime Number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number = input.nextInt();
        System.out.println("Enter A Divisor: ");
        int divisor = input.nextInt();

        if(divisor <= 1){
            System.out.println("You have to enter bigger than 1.");
        }else{
            System.out.println(primeNumbersRecursivee(number,divisor));
        }
        input.close();
    }
}
