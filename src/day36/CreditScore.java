package day36;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(746);
        System.out.println();
        checkEligible(400);
        System.out.println();

    }

    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("Congratulations! Your credit score is " + creditScore + ". You are eligible for leasing this vehicle.");
        } else {
            System.out.println("Sorry, you are not eligible for leasing this vehicle.");
        }
    }
}
