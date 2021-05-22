package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
       int [] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        System.out.println();
        ArrayUtils.printArray(new int [] {23, 24, 2 ,99, 37,760});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int [] {23, 24, 2 ,99, 37,760}));

        System.out.println("Contains = " + ArrayUtils.contains(nums, 5));
    }



}
