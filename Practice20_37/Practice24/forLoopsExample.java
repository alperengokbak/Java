package Practice20_37.Practice24;

import java.util.Scanner;

public class forLoopsExample {
    public static void main(String[] args) {
        int valid;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Valid Number: ");
        valid = input.nextInt();
        input.close();

        for(int i = 1; i<=valid; i++){
            for(int j = 1; j<=(valid-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i)-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=(valid-1); i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=((2*valid)-1) - (2*i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
