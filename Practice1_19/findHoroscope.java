package Practice1_19;

import java.util.Scanner;

public class findHoroscope {
    public static void main(String[] args) {
        int day, month;
        String  isError = "Invalid Number";
        Scanner input = new Scanner(System.in);

        System.out.println("Which month were you born ?");
        System.out.print("Month: ");
        month = input.nextInt();

        System.out.println("What day were you born ?");
        System.out.print("Day: ");
        day = input.nextInt();

        input.close();

        switch(month){
            case 1:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        System.out.println("Capricorn");
                    }else{
                        System.out.println("Aquarius");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
                
            case 2:
                if(day >= 1 && day <= 28){
                    if(day < 20 ){
                        System.out.println("Aquarius");
                    }else{
                        System.out.println("Pisces");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 3:
                if(day >= 1 && day <= 31){
                    if(day < 21){
                        System.out.println("Pisces");
                    }else{
                        System.out.println("Aries");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 4:
                if(day >= 1 && day <= 30){
                    if(day < 22){
                        System.out.println("Aries");
                    }else{
                        System.out.println("Taurus");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 5:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        System.out.println("Taurus");
                    }else{
                        System.out.println("Gemini");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 6:
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        System.out.println("Gemini");
                    }else{
                        System.out.println("Cancer");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 7:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        System.out.println("Cancer");
                    }else{
                        System.out.println("Leo");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 8:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        System.out.println("Leo");
                    }else{
                        System.out.println("Virgo");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 9:
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        System.out.println("Virgo");
                    }else{
                        System.out.println("Libra");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 10:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        System.out.println("Libra");
                    }else{
                        System.out.println("Scorpio");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 11:
                if(day >= 1 && day <= 30){
                    if(day < 22){
                        System.out.println("Scorpio");
                    }else{
                        System.out.println("Sagittarius");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            case 12:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        System.out.println("Sagittarius");
                    }else{
                        System.out.println("Capricorn");
                    }
                    break;
                }else{
                    System.out.println(isError);
                }
            default:
                System.out.println(isError);
        }
    }
}
