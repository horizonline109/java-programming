package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed: ");
        int speedLimit = 55;
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + " mph over the speed limit. Slow down!");

    }
}
