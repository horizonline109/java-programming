package solo_practice;
import java.util.*;

public class ReplitXorX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordLast = word.length();

        if ((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))) {
            System.out.print(word.substring(1, wordLast - 1));

        } else if (word.startsWith("x") || word.startsWith("X")) {
            System.out.println(word.substring(1));

        } else if (word.endsWith("X") || word.endsWith("x")) {
            System.out.println(word.substring(0, wordLast - 1));
        }
    }
}
