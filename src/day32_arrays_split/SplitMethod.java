package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java, python, selenium, html";
        String[] wordsArray =words.split(", ");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Length of Array = " + wordsArray.length);

        for (String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays";
        String [] sentenceArray = sentence.split(" ");

        System.out.println("First word = " + sentenceArray[0]);
        System.out.println("First word = " + sentence.split(" ")[0]);

        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("Length or sentence = " + sentenceArray.length);

        for (String each : sentenceArray) {
            System.out.println(each);
        }


        String cats = "bengal cat persian cat no cat here";
        String [] catsArray = cats.split(" cat ");

        System.out.println("First breed of cat: " + catsArray[0]);
        System.out.println("All cat breeds: " + Arrays.toString(catsArray));
        System.out.println("Number of cat breeds: " + catsArray.length);

        for(String each : catsArray) {
            System.out.println(each);
        }

        for(int i = 0; i < catsArray.length; i++){
            if(i == 0) {
                System.out.println("You have a sad life with no cats.");
            }
        }

    }
}
