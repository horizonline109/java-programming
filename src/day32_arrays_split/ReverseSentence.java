package day32_arrays_split;
import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String reverse = "";
        String [] words = sentence.split(" ");


        for(int i= words.length-1; i>=0; i--){
            reverse += words[i] + " ";
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Reversed: " + reverse.trim());



        String word = "java";
        String [] letters =word.split("");


        String word1 = "java";
        char [] letter = word.toCharArray();

    }
}
