package Practice1_19.Practice19;

import java.util.Scanner;

public class findPowersOfTwo {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Define a number:");
        number = input.nextInt();
        input.close();

        for(int i = 1; i<number; i*=4){
            System.out.println("Powers of two: " + i);
        }
    }
}
