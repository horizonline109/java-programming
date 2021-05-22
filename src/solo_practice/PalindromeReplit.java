package solo_practice;
import java.util.*;

public class PalindromeReplit {
    public static boolean isPalindrome(String check) {

        // your code here
        check = check.toLowerCase();
        for (int i = 0; i < check.length()/2; i++) {
            if (check.toLowerCase().charAt(i) != check.length() - 1 - i) {
                return false;
            }
        }
        return true;





    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }

}
