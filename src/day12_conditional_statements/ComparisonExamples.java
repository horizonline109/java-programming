package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
         int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        
        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));
        
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);
    }
}
