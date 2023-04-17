package Practice20_37;

import java.util.Scanner;

public class findFrequnecyOfArray {
    static void findRepeatingNumbers(int[] arr){
        int[] list = new int[arr.length];
        
    }
    static void print(int[] arr){
        int count = 0;
        System.out.print("[");
        for(int i : arr){
            System.out.print(i);
            count++;
            if(count == arr.length){
                continue;
            }
            System.out.print(",");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Define The Size Of Array: ");
        int size = input.nextInt();
        int[] list = new int[size];
        
        for(int i = 0; i < list.length; i++){
            System.out.print("Enter The Variable: ");
            int variable = input.nextInt();
            list[i] = variable;
        }
        print(list);
        findRepeatingNumbers(list);
        input.close();
    }
}
