package Practice20_39.Practice32;

public class palindromeNumbers {

    private static boolean isPalindrome(int number){
        int temp = number, reversenumber = 0, lastNumber;

        while(!(temp == 0)){
            lastNumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastNumber;
            temp /= 10;
        }
        if(reversenumber == number){
            System.out.println(number + " Is A Palindrome Number.");
            return true;
        }else{
            System.out.println(number + " Is Not A Palindrome Number.");
            return false;
        }
    }
    public static void main(String[] args) {
        isPalindrome(531);
    }
}
