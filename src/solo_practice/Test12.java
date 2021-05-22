package solo_practice;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int counter = 0;
        String duplicate = "";

        for (int i = 0; i < word.length(); i++) {
            counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    counter++;
                }
            }

            if (counter > 1) {
                duplicate += word.charAt(i);
            }
        }
        System.out.println("duplicate letters: " + duplicate);
    }
}
