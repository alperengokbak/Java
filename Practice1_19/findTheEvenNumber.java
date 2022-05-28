package Practice1_19;

import java.util.Scanner;

public class findTheEvenNumber {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number % 2 == 0){
                if(number % 4 == 0){
                    sum += number;
                }
            }
        } while (number % 2 == 0);
        System.out.println("Sum: " + sum);

        input.close();
    }
}
