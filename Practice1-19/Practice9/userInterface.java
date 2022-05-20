package Practice9;

import java.util.Scanner;

public class userInterface {
    public static void main(String[] args) {
        String userName, password, selection, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        userName = input.nextLine();
        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if(userName.equals("admin") && password.equals("1234")){
            System.out.println("Congratulations, you logged in to your account.");
        }
        else if(userName.equals("admin") && !(password.equals("1234"))){

            System.out.println("You entered wrong password.");
            System.out.println("Forgot your password, do you want to reset ?");
            System.out.println("If you want change press \"y\" or not press \"n\"(y = yes, n = no).");
            selection = input.nextLine();

            if(selection.equals("y")){
                System.out.println("Set your new password.");
                newPassword = input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Congratulations, you changed password succesfully.");
                    password = newPassword;
                }else if(!(newPassword.equals(password))){
                    System.out.println("Failed to create password, please try different password..");
                }
            }else if(selection.equals("n")){
                System.out.println("Wrong password, please, try again.");
            }
        }else if(!(userName.equals("admin")) && (password.equals("1234"))){
            System.out.println("You entered wrong Username.");
        }else{
            System.out.println("You entered wrong password and username.");
        }
        input.close();
    }
}
