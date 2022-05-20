package Practice1_19.Practice18;

import java.util.Scanner;

public class findTotalWholeOddNumber {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number % 2 == 1){
                sum += number;
            }
        } while (number > -1);

        System.out.println("Sum: " + sum);
        input.close();
        
    }
}
