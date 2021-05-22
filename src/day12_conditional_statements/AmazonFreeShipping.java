package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double totalPrice;
        System.out.println("Enter total price");
        totalPrice = scan.nextDouble();
        if (totalPrice >= 25) {
            System.out.println("Free shipping eligible. Your total is: $" + totalPrice);
        } else {
            System.out.println("Not eligible for free shipping. Your order total: $" + totalPrice);
        }
        System.out.println("Thank you for choosing Amazon.com");
    }
}
