package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main (String [] args) {
        System.out.println("java" + 5 + 3); //java53
        String java = "java";
        System.out.println(java + 5 + 3); //Still a string
        System.out.println("java" + (5 +3));
        System.out.println(5 + 3 + "java");
        System.out.println(5 + (3 + "java")); //parenthases solved first, then left to right equation

        System.out.println("hello" +1+2+3);
        System.out.println("hello" + (1+2+3));

        String str1 = "hello";
        String str2 = "friend";
        System.out.println(str1 + str2);
        System.out.println(str1 + " " + str2);

        int num1 = 7;
        int num2 =8;
        System.out.println(num1 + num2); //because num1 and num2 are integers, treated as # = 15
        System.out.println(num1 + " " +num2); //7 8
        System.out.println(num1 + "" + num2); //78 needs string between int to make them read properly

        char char1 = 'a'; //97
        char char2 = 'b'; //98
        System.out.println(char1 + char2); //195
        System.out.println(char1 + "" + char2); //ab





    }
}
