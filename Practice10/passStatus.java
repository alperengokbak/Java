package Practice10;

import java.util.Scanner;

public class passStatus {
    public static void main(String[] args) {
        int math, physic, turkish, chemistry, music;
        double average, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Notes:");
        System.out.print("Math: ");
        math = input.nextInt();
        if(0 <= math && math <= 100){
            total += math;
        }

        System.out.print("Physic: ");
        physic = input.nextInt();
        if(0 <= physic && physic <= 100){
            total += physic;
        }

        System.out.print("Turkish: ");
        turkish = input.nextInt();
        if(0 <= turkish && turkish <= 100){
            total += turkish;
        }
        System.out.print("Chemistry: ");
        chemistry = input.nextInt();
        if(0 <= chemistry && chemistry <= 100){
            total += chemistry;
        }
        System.out.print("Music: ");
        music = input.nextInt();
        if(0 <= music && music <= 100){
            total += music;
        }

        average = total/5;

        if(average <= 55){
            System.out.println("Unfortunately, your notes' avarage " + average + " you flunked");
        }else{
            System.out.println("Congratulations, you passed the class. Your notes' avarage " + average);
        }
        input.close();
    }
}
