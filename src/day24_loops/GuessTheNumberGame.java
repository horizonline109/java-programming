package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println(random.nextInt(100));
// can create counter that will check each
        int secretNum = 88;
        int guessingNumber = 0;

        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNum){
                System.out.println("Your number is too large");
            } else if(guessingNumber < secretNum){
                System.out.println("Your number is too small");
            }
        } while(guessingNumber != secretNum);
        System.out.println("Congratulation, you won! Your secret number is: " + secretNum);
    }
}
