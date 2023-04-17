package Practice20_37;

import java.util.Scanner;

public class recursiveExample2 {

    static int recursiveIncrease(int number, int realNumber){

        System.out.print(number + " ");

        if(number == realNumber){
            return number;
        }

        return recursiveIncrease(number + 5, realNumber);
    }

    static int recursiveDecrease(int number){
        
        if(number <= 0){
            return number;
        }
        System.out.print(number + " ");

        return recursiveDecrease(number - 5);
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = input.nextInt();

        int result = recursiveDecrease(number);
        recursiveIncrease(result, number); 

        input.close();
    }
}
