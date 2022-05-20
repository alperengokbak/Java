package Practice25;

import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args) {
        String userName, password;
        int count = 3, selection;
        double balance = 1500, selectedMoney;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();
            if(userName.equals("Admin") && password.equals("123")){
                System.out.println("Welcome To Miami Bank...");
                do {
                    System.out.println("Your Current Amount Of Money: " + balance);
                    System.out.println("1-) Deposit Money\n2-) Withdrawal Money\n3-) Balance Inquiry\n4-) Exit");
                    System.out.println("Please Select The Action To Be Taken:");
                    selection = input.nextInt();
                    if(selection == 1){
                        System.out.print("How Much Money To Deposit: ");
                        selectedMoney = input.nextDouble();
                        balance += selectedMoney;
                        System.out.println("Your Money's Invested Successfully!!");

                    }else if(selection == 2){
                        System.out.print("How Much Money To Withdrawal: ");
                        selectedMoney = input.nextDouble();
                        if(selectedMoney > balance){
                            System.out.println("You Don't Have Enough Money!");
                        }else{
                            balance -= selectedMoney;
                            System.out.println("You Can Get Your Money From The Below part.");
                        }
                    }else if(selection == 3){
                        System.out.println("Your Current Balance: " + balance);
                    }else if(selection == 4){
                        break;
                    }
                } while (selection != 4);
                break;
            }else{
                count--;
                System.out.println("You Entered Wrong Username Or Password!!");
                System.out.println("You Have Left: " + count + " Right.");
            }
        } while (count != 0);
        if(count == 0)
        System.out.println("Your account has been blocked!!");
        
        input.close();
    }
}
