package day41_arraylist;

import java.util.Collections;
import java.util.*;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(120); nums.add(44); nums.add(63);
        System.out.println("nums = " + nums);
        Collections.sort(nums);
        System.out.println("nums = " + nums);
    }
}
