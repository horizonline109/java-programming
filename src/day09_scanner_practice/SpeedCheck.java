package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;
        int currentSpeed = 75;
        int difference = currentSpeed - speedLimit;
        System.out.println("You are driving " + difference + " mph over the limit. Slow own!");

    }
}
