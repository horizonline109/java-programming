package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        if(number > 0) {
            System.out.println(number + " is positive");
        } else if (number == 0) {
            System.out.println(number + " is zero");
       // } else if (number < 0) {
        //    System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is negative");
        }
        //You can also do else if statement, but it's more efficient to do it as else
    }
}
