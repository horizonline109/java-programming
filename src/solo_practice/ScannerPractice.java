package solo_practice;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String [] args) {
       Scanner scan = new Scanner(System.in);

       System.out.println("Price of price1: ");
       double price1 = scan.nextDouble();
       System.out.println("Price of Cheese: " + price1);

       System.out.println("Price of Banana: ");
       double banana = scan.nextDouble();
       System.out.println("Price of Banana: " + banana);

       System.out.println("Price of Bread: ");
       double bread = scan.nextDouble();
       System.out.println("Price of Bread: " + bread);

       double total = price1 + banana + bread;
       System.out.println("TOTAL: " + total);
    }



}
