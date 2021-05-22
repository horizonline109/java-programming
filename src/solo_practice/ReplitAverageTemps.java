package solo_practice;
import java.util.*;

public class ReplitAverageTemps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        double sum = 0;
        for(double each : temps){
            sum += each;
        }
        System.out.println(sum/temps.length);


    }

}
