package solo_practice;
import java.util.Scanner;
public class ScannerPracticing {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);

            int num1 = scan.nextInt();
            int num2 =scan.nextInt();
            int num3;
            scan.nextInt();
            System.out.println("Enter 3 numbers" + num1 + num2);

            int sum = num1 + num2;
            System.out.println("Sum of numbers: ValueOfSum" + sum);

        }
}
