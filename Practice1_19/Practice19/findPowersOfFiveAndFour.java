package Practice1_19.Practice19;

import java.util.Scanner;

public class findPowersOfFiveAndFour {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Define a number:");
        number = input.nextInt();
        input.close();

        for(int i = 1; i<=number;i++){   
            if(i % 4 == 0 || i % 5 == 0){
                if(i % 4 == 0 && i % 5 == 0){
                    System.out.println("Power Of Four And Five: " + i);
                }else if (i % 4 == 0){
                    System.out.println("Power Of Four: " + i);
                }else{
                    System.out.println("Power Of Five: " + i);
                }
            }
        }
    }
}
