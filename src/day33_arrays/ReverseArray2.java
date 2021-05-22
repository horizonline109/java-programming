package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int switchNum = (num1);
                num1 = num2;
                num2 = switchNum;
        System.out.println("New num1 = " + num1);
        System.out.println("New num2 = " + num2);


        String [] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));

        //for (int i = 0, j = words.length-1; i < words.length/2; ){

        //}


        String word = "https://learn.cybertekschool.com/courses/130";
        String [] strArr = word.split("/");
        System.out.println(Arrays.toString(strArr));

        String word1 = "java program";
        String[] strArray = word.split("a");
        System.out.println(strArray.length -1); //number of a letters


    }
}
