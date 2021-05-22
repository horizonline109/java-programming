package day32_arrays_split;
import java.util.*;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]);

        //Just for fun, creating a loop for this.
        for(int count = 0; count < words.length; count++) {
            System.out.println("Number " + count + " = " + words[count]);
        }
        System.out.println("Printing complete.");

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] results = googleResult.split(" "); //either will work
        System.out.println(results[1]); //same way to print below
        System.out.println(googleResult.split(" ")[1]);
        System.out.println("Seconds = " + results[3].replace("(", ""));
    }
}
