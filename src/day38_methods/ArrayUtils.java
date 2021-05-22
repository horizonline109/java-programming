package day38_methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ArrayUtils {
    public static String printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
            System.out.println();
        }
        return Arrays.toString(nums);
    }


    public static int sum(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (each == num) {
                found = true;
                break;
            }
        }
        return found;
    }
}



