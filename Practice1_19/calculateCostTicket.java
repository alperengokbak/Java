package Practice1_19;

import java.util.Scanner;

public class calculateCostTicket {
    public static void main(String[] args) {
        double distance, percost = 0.10, totally, discount;
        int old, flightType;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter valid distance:");
        distance = input.nextDouble();
        System.out.print("Please enter your age truely: ");
        old = input.nextInt();
        System.out.println("Select your flight type:");
        System.out.println("1 => One-Way flight\n2 => Round-trip flight:");
        flightType = input.nextInt();
        input.close();

        totally = distance * percost;

        if(distance > 0 && old > 0 && (flightType == 1 || flightType == 2)){
            if(flightType == 1){
                if(old < 12){
                    discount = totally * 0.5;
                    totally -= discount;
                }else if(old >= 12 && old < 24){
                    discount = totally * 0.1;
                    totally -= discount;
                }else if(old > 65){
                    discount = totally * 0.3;
                    totally -= discount;
                }
                System.out.println("Totally: " + totally);
            }else{
                discount = totally * 0.2;
                totally -= discount;
                if(old < 12){
                    discount = totally * 0.5;
                    totally -= discount;
                }else if(old >= 12 && old < 24){
                    discount = totally * 0.1;
                    totally -= discount;
                }else if(old > 65){
                    discount = totally * 0.3;
                    totally -= discount;
                }
                System.out.println("Totally: " + totally*2);
            }
        }else{
            System.out.println("Invalid Variable !!");
        }
    }
}
