package day24_loops;
import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretPinCode = 5555;
        int pinCode; // variable should be declared outside the do while loop
        do {
            System.out.println("Enter your pin :");
            pinCode = scan.nextInt();

        } while (secretPinCode != pinCode);
        System.out.println("Welcome to your account");

    }
}
