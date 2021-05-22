package solo_practice;
import java.util.*;

public class ReplitLoopsCountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for(int i = 0; i < str.length()-2; i++){
            String triple = str.charAt(i) + "" + str.charAt(i) + "" + str.charAt(i);
            if (str.substring(i,i+3).equals(triple)){
                count++;
            }
        }

        System.out.println(count);
    }
    //TODO complete this replit

}
