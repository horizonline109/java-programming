package day42_arraylist;
import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
List<Character> letters = new ArrayList<>();
letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(" reversed letters = " + letters);


        Collections.frequency(letters, 'a');
        System.out.println(Collections.frequency(letters, 'a'));
        
        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);


        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));


        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("After replaceAll =" + letters);

        Collections.reverse(letters);
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println(letters);


        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        System.out.println("max = " + max);
        
        int min = Collections.min(nums);
        System.out.println("min = " + min);

        Collections.frequency(nums, 5);
        System.out.println("min = " + min);
        
        Collections.replaceAll(nums, 5, 50);
        System.out.println("min = " + min);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Reversed Sort = " + nums);

    }
}
