package solo_practice;

import java.util.*;

public class ReplitShiftLeft {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i = 0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE
            int[] leftShift = new int[nums.length];
            leftShift[leftShift.length - 1] = nums[0];
            for (int i = 0; i < leftShift.length - 1; i++) {
                leftShift[i] = nums[i + 1];
            }
            System.out.println(Arrays.toString(leftShift));

        }
}
