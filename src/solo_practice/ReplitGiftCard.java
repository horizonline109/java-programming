package solo_practice;

import java.util.Scanner;

public class ReplitGiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = 100;

        System.out.println("Enter item here:");
        String item = scan.next();

        if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 60) + "$");
        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 25) + "$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 25) + "$");
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 30) + "$");
        } else if (item.equals("Laptop")) {
            balance = (balance - 200);
            //System.out.println("Thank you for your purchase!");
            //System.out.println("Your current balance is: " + (balance - 200) + "$");
        } else if (item.equals("Plants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 50) + "$");
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 40) + "$");
        } else if (item.equals("Smartphone")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 1000) + "$");
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 5) + "$");
        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 10) + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
