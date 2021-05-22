package day33_arrays;
import java.util.*;

public class ForLoopWith2Variables {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println(" i = " + i + " j = " + j);
        }

        System.out.println("**** 2 Way For Loop *****");
        for(int i = 1, j = 5; i <=5; i++, j--){
            System.out.println("i = " + i + " j = " + j);
            //System.out.println("i = " + i);
            //System.out.println("j = " + j);
        }
    }
}
