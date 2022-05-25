package Practice20_37.Practice36;

import java.util.Scanner;

public class primeNumbersIterative {

    private static void primeNumbersIterativee(){
        int number, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println(number + " Is A Prime Number.");
        }else{
            System.out.println(number + " Is Not A Prime Number.");
        }
        input.close();
    }
    public static void main(String[] args) {
        primeNumbersIterativee();
        
    }
}
