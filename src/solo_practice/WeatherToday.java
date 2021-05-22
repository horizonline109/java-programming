package solo_practice;
import java.util.Scanner;
public class WeatherToday {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.next();
        System.out.println(weather + "- that's a great day!");
    }
}
