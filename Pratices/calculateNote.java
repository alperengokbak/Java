package Pratice_1;
import java.util.Scanner;
public class calculateNote {
    public static void main(String[] args) {

        int maths,physic,chemistry,turkish,history,music,sum;
        double avarage;
        String result;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Maths' note:");
        maths = input.nextInt();
        
        System.out.print("Please enter Physic' note:");
        physic = input.nextInt();

        System.out.print("Please enter Chemistry' note:");
        chemistry = input.nextInt();

        System.out.print("Please enter Turkish' note:");
        turkish = input.nextInt();
        
        System.out.print("Please enter History' note:");
        history = input.nextInt();

        System.out.print("Please enter Music' note:");
        music = input.nextInt();

        sum = (maths+physic+chemistry+turkish+history+music);
        avarage = sum/6;
        System.out.println("Your avarage of notes:" + avarage);

        result = (avarage > 60 || avarage == 60) ? "Passed!" : "Flunked...";
        System.out.println(result);
    }
}
