package Practice20_37;

import java.util.Arrays;

public class CalculateMinAndMax {
    static void findMinAndMax(int[] arr){
        int max = arr[0], min = arr[0];
        if(arr.length == 0){
            System.out.println("There are not any variable in that array!!");
        }
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    static void findMinAndMax2(int[] arr, int n){
        if(arr.length == 0){
            System.out.println("There are not any variable in that array!!");
        }
        Arrays.sort(arr);
        Arrays.toString(arr);
        for(int i : arr){
            if(n < i){
                System.out.println("The small and the closest number: " + arr[Arrays.binarySearch(arr, i)-1]);
                System.out.println("The big and the cloesest number: " + i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {30, 4, 25, 18, 9};
        findMinAndMax2(list, 5);
    }
}
