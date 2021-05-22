package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        System.out.println("isNullOrEmpty = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty = " + isNullOrEmpty(word));
    }


    public static boolean isNullOrEmpty(String str) { //null should be first, + || and not |
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }
}