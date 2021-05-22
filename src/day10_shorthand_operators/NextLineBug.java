package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cost of Rent: ");
        double rent = scan.nextDouble();
        System.out.println("Month: ");
        scan.nextLine(); //fixes the known bug. WORK-AROUND
        String month = scan.nextLine();
        System.out.print("Cost of rent is " + rent);
        System.out.println(" for the month of " + month);

    }
}
