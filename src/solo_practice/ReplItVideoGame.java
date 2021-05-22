package solo_practice;
import java.util.Scanner;
public class ReplItVideoGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupon = scan.nextInt();
        int candies = (coupon / 10);
        int gumballs = (coupon % 10) /3;
        System.out.println("Number of Candies: " + candies);
        System.out.println("Number of Gumballs: " + gumballs);

        System.out.println("Enter number of coupons:");
        if(coupon <= 2) {
            System.out.println("Not enough coupons");
        }
    }
}
