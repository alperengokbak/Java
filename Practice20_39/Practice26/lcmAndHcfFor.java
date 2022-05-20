package Practice20_39.Practice26;

import java.util.Scanner;

public class lcmAndHcfFor {
    public static void main(String[] args) {
        int num1, num2, hcf, lcm;    //HCF is Highest common factor
        Scanner input = new Scanner(System.in);
        System.out.print("Select The First Number: ");
        num1 = input.nextInt();
        System.out.print("Select The Second Number: ");
        num2 = input.nextInt();
        input.close();

        if(num1 > num2){
            for(int i = num2; num2 >= 1; i--){
                if(num1%i == 0 && num2%i == 0){
                    hcf = i;
                    System.out.println("Highest Common Factor(Ebob): " + hcf);    //Ebob's meaning same like the HCF in Turkish.
                    lcm = (num1 * num2) / hcf;                                    //LCM's formula is "LCM = (num1 * num2) / HCF"
                    System.out.println("Least Common Multiple(Ekok): " + lcm);    //Ekok's meaning same like the LCM in Turkish.
                    break;
                }
            }
        }else{
            for(int i = num1; num1 >= 1; i--){
                if(num1%i == 0 && num2%i == 0){
                    hcf = i;
                    System.out.println("Highest Common Factor(Ebob): " + hcf);    //Ebob's meaning same like the HCF in Turkish.
                    lcm = (num1 * num2) / hcf;                                    //LCM's formula is "LCM = (num1 * num2) / HCF"
                    System.out.println("Least Common Multiple(Ekok): " + lcm);    //Ekok's meaning same like the LCM in Turkish.
                    break;
                }
            }
        }
        //I wanted to calculate the LCM without formula. That's why, there are 2 result of LCM.
        for(int i = 1; i <= num1*num2; i++){
            if(i%num1 == 0 && i%num2 == 0){
                System.out.println("lcm: " + i);
                break;
            }
        }
    }
}
