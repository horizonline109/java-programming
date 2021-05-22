package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {

        int bonus = 0;
        int salesAmount = 2000;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;// conditional value assignment
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("You bonus for " + salesAmount + " is $" + bonus);
    }
}
