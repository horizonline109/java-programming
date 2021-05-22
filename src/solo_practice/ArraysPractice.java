package solo_practice;
import java.util.*;

public class ArraysPractice {
    public static void main(String[] args) {
        String item = "wooden spoon";
        System.out.println(item);
        //casting to Char Array
        System.out.println("length of String = " + item.length());
        char [] itemArray = item.toCharArray();
        System.out.println(itemArray); //prints as a string
        System.out.println(Arrays.toString(itemArray));
        System.out.println("Size of array = " + itemArray.length);
        

        String str = "cybertek";
        for(int i =0; i <=str.length(); i+=2){
            System.out.println(str.charAt(i));
        }


    }
}
