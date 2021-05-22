package day09_scanner_practice;
import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        System.out.println("Fahrenheit to Celsius: ");
        double conversion = (fahrenheit - 32) * 5 / 9;
        System.out.println(conversion);

    }
}
