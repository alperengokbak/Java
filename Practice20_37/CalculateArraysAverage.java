package Practice20_37;

public class CalculateArraysAverage {
    static double findMean(int[] arr){
        double result = 0;
        if(arr.length == 0){
            return 0;
        }
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result / arr.length;
    }

    static float findHarmonicMean(int[] arr){
        float result = 0;
        if(arr.length == 0){
            return 0;
        }
        for(int i = 0; i < arr.length; i++){
            result += 1f / arr[i];
        }
        return arr.length / result;
    }
    public static void main(String[] args) {
        int[] list = {18, 25, 30, 9};
        // System.out.println(findMean(list));
        System.out.println(findHarmonicMean(list));
    }
}
