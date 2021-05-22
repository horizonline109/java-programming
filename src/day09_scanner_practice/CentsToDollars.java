package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents: ")  ;
        int cents =  scan.nextInt();      //int cents = 123
        int dollars = cents / 100;
        int remainder = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("Remainder = " + remainder);
        System.out.println("In " + cents + " cents: " + dollars + " dollar " + remainder + " cents.");
        //Desired output: "In 123 cents: 1 dollar 23 cents.
    }
}
