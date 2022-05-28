package Practice1_19;

import java.util.Scanner;

public class airTempature {
    public static void main(String[] args) {
        double temp;
        Scanner input = new Scanner(System.in);

        System.out.println("How high is it today?");
        System.out.print("Enter degree:");
        temp = input.nextDouble();
        input.close();

        if(temp < 5){
            System.out.println("You can ski around any mountain.");
        }else if( 5 <= temp && temp <= 25){
            if(5 <= temp && temp <= 15){
                System.out.println("Maybe, you can go to cinema with your friends today. ");
            }else if(15 < temp && temp <= 25){
                System.out.println("The weather is awsome to go picnic at the forest!!");
            }
        }else{
            System.out.println("You may want to go lake or like that place to swim.");
        }

    }
}
