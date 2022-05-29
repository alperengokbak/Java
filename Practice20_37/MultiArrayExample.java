package Practice20_37;

public class MultiArrayExample {
    static void createA(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == 0 || i == 2){
                    arr[i][j] = " * ";
                }else if(j == 0 || j == 3){
                    arr[i][j] = " * ";
                }
                else{
                    arr[i][j] = "   ";
                }
            }
        }
    }

    static void createP(String[][] arr){
for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == 0 || i == 2){
                    arr[i][j] = " * ";
                }else if(j == 0){
                    arr[i][j] = " * ";
                }else if(j == 3){
                    arr[i][j] = " * ";
                    if(i == 3 || i == 4 || i == 5){
                        arr[i][j] = "   ";
                    }
                }
                else{
                    arr[i][j] = "   ";
                }
            }
        }
    }

    static void print(String[][] arr){
        for(String[] row : arr){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[][] list = new String[6][4];
        createP(list);
        print(list);
    }
}
