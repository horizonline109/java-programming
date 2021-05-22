package day09_scanner_practice;
import java.util.Scanner;
public class EnterMiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("##### MILES TO KM CONVERTER #####");
        System.out.println("Enter miles: ");
        double miles = scan.nextDouble();
        double conversion = miles * 1.609;
        System.out.println("Miles to kilometer: " + conversion);
        //double kmconversion = miles * 1.609;

    }
}
