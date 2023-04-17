package Practice1_19;

import java.util.Scanner;

public class findAverage {
    public static void main(String[] args) {
        int  number, count = 0, sum = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = input.nextInt();
        input.close();

        for(int i = 1; i< number;i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        average = sum / count;
        System.out.println("Average: " + average);
    }
}
