package Practice20_37;

public class FindRepeatingNumber {
    static boolean isFind(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
    static void findRepeatingNumber(int[] arr){
        int[] list = new int[arr.length];
        int startIndex = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((i != j) && arr[i] == arr[j]){
                    if(arr[i] % 2 == 0){
                        if(!(isFind(list, arr[i]))){
                            list[startIndex++] = arr[i];
                        }
                        break;
                    }
                }
            }
        }
        print(list);
    }
    static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] list = {18, 30, 18, 25, 9, 25, 30, 8, 12, 12};
        findRepeatingNumber(list);
    }
}
