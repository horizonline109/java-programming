package solo_practice;
import java.util.*;

public class MaxAndMinArray {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int [] num5 = {5, 90, 22, 34,988};
        System.out.println(Arrays.toString(num5));

    int max = 0;
    for(int i = 0; i < num5.length; i++){
        if(num5[i] > max) {
            max = i;
        }
    }
        System.out.println("Max number is: " + num5[num5.length -1]);
        System.out.println("Minimum number is: " + num5[0]);
        }
    }
