package solo_practice;
import java.util.*;

public class ReplitMiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() % 2 == 1 && word.length() >= 3){
            int middleOdd = word.length() / 2;
            System.out.println(word.charAt(middleOdd));
        } else if (word.length() % 2 == 1 && word.length() == 1){
            System.out.println("" + word.charAt(0) + word.charAt(0) + word.charAt(0));
        }

        if (word.length() % 2 == 0 && word.length() >= 4){
            int middleEven = word.length() / 2;
            System.out.println("" + word.charAt(middleEven - 1) + word.charAt(middleEven));
        } else if (word.length() % 2 == 0 && word.length() == 2){
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1));
        }
    }

}