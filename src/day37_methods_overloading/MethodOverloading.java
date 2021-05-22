package day37_methods_overloading;

import java.util.*;

public class MethodOverloading {

 /*   public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("result = " + (num1 + num2));
    }

    public static int sum(int num1, int num2, int num3) {
        System.out.println("sum(double num1, double num2, double num3)");
        System.out.println("result = " + (num1 + num2 + num3));
        return num1;
    }

    public static void sum(String str1, String str2) {
        System.out.println("sum(string, string)");
    }
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num2 =new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(4, 1, 8, -42,2,10));
        for(int each: nums){
            switch(each){
                case 1:
                    num2.add(1);
                case 5:
                    num2.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    num2.remove(0);
            }
        }
        System.out.print(num2);

    }
}
