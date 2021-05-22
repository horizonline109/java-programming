package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: $"); //3.99
        double price1 = scan.nextDouble();
        System.out.println("Enter price for bread: $"); //1.55
        double price2 = scan.nextDouble();
        System.out.println("Enter price for cucumbers: $"); //1.09
        double price3 = scan.nextDouble();
        double total = (price1 + price2 + price3);
        System.out.println("TOTAL: $" + total);

    }
}
