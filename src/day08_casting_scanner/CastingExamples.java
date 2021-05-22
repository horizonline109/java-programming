package day08_casting_scanner;

import javax.lang.model.SourceVersion;

public class CastingExamples {
    public static void main(String [] args) {
        //byte - short - int -long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;
        
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);
        System.out.println("num9 = " + num9);



        System.out.println("=====================");

        //EXPLICIT CASTING:
        int num10 = 55;
        byte num11 = (byte)num1;
        short num12 = (short)num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);

        double num15 = 1234.5;
        int num16 = (int)num15;

        int num17 = 300;
        byte num18 = (byte)num17; //when you convert to bytes from int that's a large size, runs a formula
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        char letter = 'M';
        int numLetter = letter;
        System.out.println(numLetter); //77
        char letter1 = 'M';
        System.out.println(letter1);

    }
}
