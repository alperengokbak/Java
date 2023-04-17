package Practice20_37;

import java.util.Scanner;

public class lcmAndHcfWhile {
    public static void main(String[] args) {
        int num1, num2, hcf, lcm, i = 1;    //HCF is Highest common factor
        Scanner input = new Scanner(System.in);
        System.out.print("Select The First Number: ");
        num1 = input.nextInt();
        System.out.print("Select The Second Number: ");
        num2 = input.nextInt();
        input.close();

        while(i<= num1*num2){
            if(i % num1 == 0 && i % num2 == 0){
                lcm = i;
                System.out.println("Least Common Multiple(Ekok): " + lcm);     //Ekok's meaning same like the LCM in Turkish.
                break;
            }
            i++;
        }
        int j = num1 * num2; 
        while(j >= 1){
            if(num1%j == 0 && num2%j == 0){
                hcf = j;
                System.out.println("Highest Common Factor(Ebob): " + hcf);    //Ebob's meaning same like the HCF in Turkish.
                break;
            }
            j--;
        }
    }
}
