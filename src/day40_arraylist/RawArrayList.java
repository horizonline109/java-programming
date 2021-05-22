package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); // RAW==> nlt recommended
        List list2 = new ArrayList();

        list1.add("apples");
        list1.add("pancakes");
        System.out.println("list1 = " + list1);

        ArrayList<Integer> nums = new ArrayList<>(); //restricted==>reommended
    }
}
