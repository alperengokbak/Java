package Practice2;

import java.util.Scanner;

public class calculateAmountKdv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double money, amountKdv, kdv, rateOfKdv = 0.18, rateOfKdv2 = 0.08;
        System.out.print("Enter amount of your money: ");
        money = input.nextDouble();
        input.close();

        if(money > 0 && money < 1000){
            System.out.println("Rate of KDV: " + rateOfKdv);
            amountKdv = money * rateOfKdv;
            kdv = money + amountKdv;
            System.out.println("Price with VAT: " + amountKdv);
            System.out.println("Amount of KDV: " + kdv);
        }
        else if(money >= 1000){
            System.out.println("Rate of KDV: " + rateOfKdv2);
            amountKdv = money * rateOfKdv2;
            kdv = money + amountKdv;
            System.out.println("Price with VAT: " + amountKdv);
            System.out.println("Amount of KDV: " + kdv);
        }
        System.out.println("Money: " + money);
    }
}
