package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        //Car Dealership
        double budget = 5000;
        String model = "Tesla";
        if (budget <= 5000 && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) {
            System.out.println("Within our budget. Let's talk");
        } else {
            System.out.println("Thank you for your time. I'll keep looking.");
        }

        int apples = 5;
        if (!(apples > 2)) {
            System.out.println("You do not have less than " + apples + " apples.");
        } else {
            System.out.println("You have less than " + apples + " apples.");
        }
    }
}
