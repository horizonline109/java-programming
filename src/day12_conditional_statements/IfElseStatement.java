package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }

        int count = 25;
        //check if count is more than 30.
        if (count > 30) {
            System.out.println("count is more than 30");
        } else {
            System.out.println("count is less than 30");
        }

        byte age = 25;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
            System.out.println("Age is greater than or equal to 18");
        } else {
            System.out.println("You are not eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}
