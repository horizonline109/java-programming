package day38_methods;
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String username = "";
        if (StringUtils.isNullOrEmpty(username)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }
        System.out.println("Palindrome?" + isPalindrome("kayak"));

        String word ="java";
        System.out.println("word = " + word);
        System.out.println("reverse = " + reverse(word));
        System.out.println("Reverse word to "+ reverse(word));

    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.length() - 1 - i) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str){
        String reverse ="";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
