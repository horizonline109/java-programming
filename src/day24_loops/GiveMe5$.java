package day24_loops;
import java.util.Scanner;

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me five dollars.");
        int dollar = scan.nextInt();

        while(dollar != 5) {
            if(dollar > 5) {
                System.out.println("That's too much. I will give you change.");
            }
            System.out.println("Give me five dollars.");
            dollar = scan.nextInt();

        }
        System.out.println("Thank you for five dollars.");
    }
}
