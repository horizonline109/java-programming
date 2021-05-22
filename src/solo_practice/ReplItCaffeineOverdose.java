package solo_practice;
import java.util.Scanner;
public class ReplItCaffeineOverdose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfMilligrams = 10*1000;
        System.out.println("Number of milligrams in drink:");
        int drinks = 10*1000 / numOfMilligrams;
        System.out.println("Number of drinks:");
        drinks = scan.nextInt();
        System.out.println("It would take about " + drinks + " drinks for a lethal overdose.");

    }
}

