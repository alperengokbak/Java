package Practice20_39.Practice28;

import java.util.Scanner;

public class findPerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, result = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                result += i;
            }
        }
        if(result == number){
            System.out.println(number + " is Magnificent number.");
        }else{
            System.out.println(number + " is not Magnificent number.");
        }
    }
}
