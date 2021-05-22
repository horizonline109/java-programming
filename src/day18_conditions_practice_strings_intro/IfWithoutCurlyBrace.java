package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBrace {
    public static void main(String[] args) {
        String todaysClass = "python";
        if(todaysClass.equals("java")) {
            System.out.println("java is fun");
        }else {
            System.out.println("it is not java. It is " + todaysClass);
        }

        int a = 2;

        if(a == 1)
            System.out.println("a is 1");
        System.out.println("1 is a");

        // only the second print statement will print, because the curly braces do not include it in the if statement
    }
}
