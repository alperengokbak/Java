package Practice20_37.Practice22;

import java.util.Scanner;

public class findArmstrongNumbers {
    public static void main(String[] args) {
        int number, findDigit = 0, temp, valueDigit, result = 0, powNumber, totalDigit = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Valid Number: ");
        number = input.nextInt();
        input.close();

        temp = number;
        while(!(temp == 0)){
            temp /= 10;
            findDigit++;
        }

        temp = number;
        while(!(temp == 0)){
            valueDigit = temp % 10;     // This line shows us the last digit.
            powNumber = 1;
            totalDigit += valueDigit;
            for(int i = 1; i<=findDigit; i++){
                powNumber *= valueDigit;
            }
            result += powNumber;
            temp /= 10;
        }
        if(result == number){
            System.out.println("Number " + number + " is Armstrong' number.");
        }else{
            System.out.println("Number " + number + " is not Armstrong' number.");
        }

        System.out.println("Sum of digit of number: " + totalDigit);
        


    }
}
