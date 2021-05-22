package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1819;
        int expPinCode =1112;

        int last4SSN = 1819;
        int pinCode = 1111;
        if(last4SSN == expLast4SSN && pinCode == expPinCode){
                System.out.println("Welcome to your account");
            } else {
                System.out.println("Authentication unsuccessful. Please try again");
                if (last4SSN != expLast4SSN) {
                    System.out.println("Last four SSN number is incorrect");
                 }
                if(pinCode != expPinCode) {
                    System.out.println("Pincode number is incorrect");
                }
        }
    }
}
