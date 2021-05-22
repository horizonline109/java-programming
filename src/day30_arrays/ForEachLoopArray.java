package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int [] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};
        for(int each : data){
            System.out.print(each + " ");
        }
        System.out.println();

        for(int i = 0; i < data.length; i ++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Last value: " + data[data.length - 1]);


        for(int idx = data.length - 1; idx>= 0; idx--) {
            System.out.print(data[idx] + " ");
        }



        int[] nums = {22, 55, 11};
        for(int i =0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //for each loop. Can only be used with array collections
        int [] nums2 = {33, 11, 66};
        for( int each :  nums2) {
            System.out.println(each);
        }

    }
}
