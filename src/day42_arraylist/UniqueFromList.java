package day42_arraylist;
import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println("nums = " + nums);
        //List<Integer> getUniqueIntegers = (List<Integer> nums) {
           // List<Integer> uniqueList = getUniqueIntegers;
            for (int num : nums) {
                if (Collections.frequency(nums, num) == 1) {
                    System.out.print(num + " ");
              //      uniqueList.add(num);
                }
            }
           // System.out.println("\nuniqueList = " + uniqueList);
       // }




        Collections.shuffle(nums);
        System.out.println("Shuffle = " + nums);

    }
}
