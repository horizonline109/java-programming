package day31_arrays;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); // 1
        System.out.println(Arrays.binarySearch(nums, 2344));//4
        System.out.println(Arrays.binarySearch(nums, 25)); //-3
        System.out.println(Arrays.binarySearch(nums, 700)); //-5
        System.out.println(Arrays.binarySearch(nums, 44)); // -2

        if(Arrays.binarySearch(nums, 12345)>=0) {
            System.out.println("12345 is present.");
        } else {
            System.out.println("12345 is not present.");
        }

        int [] nums1 = {4, 12, 53};
        int [] nums2 = {4, 12, 53};

        Arrays.equals(nums1, nums2); //true or false statement
    }
}
