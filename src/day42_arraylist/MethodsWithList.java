package day42_arraylist;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "href", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 234, 11, 5, 19);
        System.out.println(sumIntegerList(nums));
         int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);



    }

    public static void printStrList(List<String> str) {
        for(String each : str){
            System.out.print(each + " ");
        }
        System.out.println();

    }

   public static int sumIntegerList(List<Integer> nums) {
        int sum = 0;
        for(int each: nums) {
            sum += each;
        }
            return sum;
        }
    }



