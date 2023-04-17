package Practice20_37;

import java.util.Scanner;

public class calculateExponent2 {

    static int exponent(int base, int exponent){
        int result = 1;
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        return result;
    }

    static void exponenet(){
        int base, exponenet, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        base = input.nextInt();
        System.out.print("Enter exponent of number: ");
        exponenet = input.nextInt();

        for(int i = 1; i <= exponenet; i++){
            result *= base;
        }
        System.out.println("Result: " + result);
        input.close();
    }
    static int exponenetRecursive(int base, int exponenet){
        if(exponenet < 1){
            return 1;
        }else{
            return base * exponenetRecursive(base, exponenet-1);
        }
    }
    static void menu(){
        String menu = "1: Exponent with int:\n2: Exponent with void:\n3: Exponent with recursive:\n0: Exit:";
        System.out.println(menu);
    }
    public static void main(String[] args) {

        System.out.println(exponent(3, 3));         //With int function
        System.out.println(exponenetRecursive(2, 3));       //With Recursive function
        exponenet();        // with void funciton
    }
}
