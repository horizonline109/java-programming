package solo_practice;
import java.util.Scanner;
public class GradeSolo {
            public static void main(String[] args) {
                //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
                // Variables are already declared and given
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number:");
                int number = input.nextInt();

                //CODE HERE
                if (number % 2 == 0){
                    System.out.println(number + " is even");
                }
                System.out.println("Enter a number:");
                number = input.nextInt();
                if(number % 2 != 0) {
                    System.out.println(number + " is odd");
                }
                System.out.println("Enter a number:");
                number = input.nextInt();
                if(number % 2 == 0) {
                    System.out.println(number + " is even");
                }

            }
        }
