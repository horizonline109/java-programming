package solo_practice;
import java.util.*;

public class ReplitInnerOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for (int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for (int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        int count = 0;
        for (int each : inner) {
            for (int l = 0; l < outer.length; l++) {
                if (Arrays.binarySearch(outer, each) >= 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println((count == inner.length));
    }
}
