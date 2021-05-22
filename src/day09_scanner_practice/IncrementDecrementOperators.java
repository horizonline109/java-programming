package day09_scanner_practice;

public class IncrementDecrementOperators {
    public static void main(String [] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);
        
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode +1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode += 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        //type 4 different ways of subtracting by 1
        linesOfCode = linesOfCode - 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode -= 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode--;
        System.out.println("linesOfCode = " + linesOfCode);
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--; letter--; letter--;
        System.out.println("letter = " + letter);
    }
}
