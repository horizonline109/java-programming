package solo_practice;
import java.util.*;

public class ReplitEqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String sentence = "We study javajavajava python python  java python not python javascript";
        int countJava = 0;
        int countPython = 0;
        boolean result = true;


        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", "");
                countJava++;
            }
            if (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", "");
                countPython++;
            }

        }
        if (countJava == countPython) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
