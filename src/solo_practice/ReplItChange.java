package solo_practice;
import java.util.Scanner;
public class ReplItChange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        int quarters= cents / 25;
        int dimes = (cents%25) /10;
        int nickles = ((cents % 25) % 10) / 5;
        int pennies = (((cents % 25) % 10) % 20) / 1;

        if(cents > 0 && cents < 100) {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies");
        }
    }
}
