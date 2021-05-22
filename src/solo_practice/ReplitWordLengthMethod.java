package solo_practice;
import java.util.Scanner;

public class ReplitWordLengthMethod {

        public static int wordCount(String words) {
            // your code
            return words.length();


        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(wordCount(in.nextLine()));
        }

    }
