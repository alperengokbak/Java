package Practice20_37;

import java.util.Scanner;

public class sortVariable {
    static void sortArray(int[] arr){
        int temp = 0;
        int[] list = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            list[i] = arr[i];
        }
    }
    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
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
        sortArray(list);
        print(list);
        input.close();
    }
}
