package day13_conditional_statements;
//import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;
        int inputPincode = 1256;
        System.out.println("*****Welcome to TD Bank ATM*****");
        System.out.println("Enter your Pincode: ");
        //inputPincode = scan.nextInt();
        if (inputPincode == secretPincode) {
            System.out.println("Welcome to your account.");
            System.out.println("You can withrdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pincode.");
            System.out.println("Please try again");
        }
        System.out.println("Thank you for using TD Bank ATM!");

    }
}
