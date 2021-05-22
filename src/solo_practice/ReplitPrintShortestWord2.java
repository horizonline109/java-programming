package solo_practice;

import java.util.*;

public class ReplitPrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below
        String[] words = str.split(", ");
        String shortestWord = words[0];
        String allWords = "";
        for (String eachWord : words) {
            if (eachWord.length() < shortestWord.length()) {
                shortestWord = eachWord;
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == shortestWord.length()) {
                allWords += words[i] + " ";
            }
        }
        String[] shortWords = allWords.split(" ");
        Arrays.sort(shortWords);
        System.out.println(Arrays.toString(shortWords));
    }
}

