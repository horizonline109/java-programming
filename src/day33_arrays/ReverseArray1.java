package day33_arrays;
import java.util.*;

public class ReverseArray1 {
    public static void main(String[] args) {

        int [] nums = { 5, 10, 4, 100};
        int [] numsRev = new int[nums.length]; //// 0,0,0,0,
        int j = 0;
        for(int i = nums.length -1; i >= 0; i--, j++) {
            numsRev[j] = nums[i];
            //System.out.print(nums[i] + " ");
        }
        System.out.print(Arrays.toString(nums));
        System.out.println();
        System.out.println(Arrays.toString(numsRev));

        for(int i= nums.length-1; i>=0; i--){
            numsRev[0] += nums[i];
            System.out.print(numsRev[i] + " ");
        }

        for(int i =0; i <=4; i--, j++){
            System.out.println(i);
            System.out.println(j);
        }


    }
}
