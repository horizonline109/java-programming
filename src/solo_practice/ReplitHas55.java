package solo_practice;
import java.util.*;

public class ReplitHas55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i] == 5) && (nums[i + 1] == 5)) {
                System.out.println(true);
                return;
            }
        }
            System.out.println(false);
    }
}
