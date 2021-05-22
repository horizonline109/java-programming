package day24_loops;
import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numberToStop, start;
        System.out.println("Enter a number:");
        numberToStop = scan.nextInt();

        start = 1;
        while(start <= numberToStop) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println("Finished the count");

    }
}
