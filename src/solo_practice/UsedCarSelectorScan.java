package solo_practice;
import java.util.Scanner;
public class UsedCarSelectorScan {
    public static void main(String[] args) {
        //Car Dealership
        Scanner scan = new Scanner(System.in);
        double budget, carPrice;
        String model;
        System.out.println("Enter your budget here:");
        budget = scan.nextDouble();
        System.out.println("Enter car price here:");
        carPrice = scan.nextDouble();
        System.out.println("Enter vehicle model here:");
        model = scan.next();


        if (budget <= 5000 && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) {
            System.out.println("Within our budget. Let's talk");
        } else {
            System.out.println("Thank you for your time. I'll keep looking.");
        }
    }
}

