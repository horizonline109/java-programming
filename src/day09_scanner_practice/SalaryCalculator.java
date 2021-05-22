package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Hourly Rate: ");
        double hourlyRate = 55.0;
        double weeklyPay = 40 * hourlyRate;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = 12 * monthlyPay;
        System.out.println("Weekly pay: $" + weeklyPay);
        System.out.println("Monthly pay: $" + monthlyPay);
        System.out.println("Annual pay: $" +annualPay);



    }

}
