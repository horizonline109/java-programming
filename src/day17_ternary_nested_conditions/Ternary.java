package day17_ternary_nested_conditions;

public class Ternary {
    public static void main(String[] args) {
        int score = 99;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("Your score is " + score + ". You " + result + " this test.");

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("Your food service rating score is: " + x);
        System.out.println("Your quality = " + quality);
        System.out.println(quality.equals("good") ? 100 : 0);

        char grade;
        System.out.println(grade = (score > 90) ? 'A' : 'B');
        System.out.println(grade);

        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println(evenOdd);

    }
}
