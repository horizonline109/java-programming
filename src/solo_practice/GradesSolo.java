package solo_practice;
import java.util.Scanner;
public class GradesSolo {
        public static void main(String[] args) {
            // Enter your code here
            Scanner scan = new Scanner(System.in);
            String math, biology, english, chemistry, music;
            double mathGrade, bioGrade, englGrade, chemGrade, musicGrade;

            System.out.println("Welcome to the Grader!");
            System.out.println("Please enter subject number 1 and score for this subject");
            math = scan.next();
            mathGrade = scan.nextDouble();
            System.out.println(math);
            System.out.println(mathGrade);
            System.out.println("Please enter subject number 2 and score for this subject");
            biology = scan.next();
            bioGrade = scan.nextDouble();
            System.out.println(biology);
            System.out.println(bioGrade);
            System.out.println("Please enter subject number 3 and score for this subject");
            english = scan.next();
            englGrade = scan.nextDouble();
            System.out.println(english);
            System.out.println(englGrade);
            System.out.println("Please enter subject number 4 and score for this subject");
            chemistry = scan.next();
            chemGrade = scan.nextDouble();
            System.out.println(chemistry);
            System.out.println(chemGrade);
            System.out.println("Please enter subject number 4 and score for this subject");
            music = scan.next();
            musicGrade = scan.nextDouble();
            System.out.println(music);
            System.out.println(musicGrade);

            double sum = (mathGrade + bioGrade +englGrade + chemGrade + musicGrade) / 4;
            System.out.println("Summary: " + math);
    }
}
