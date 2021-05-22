package solo_practice;
import java.util.*;

public class ReplitGetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //YOUR CODE HERE;
        int breadIndex1 = str.indexOf("bread");
        int breadIndex2 = str.lastIndexOf("bread");

        String filling = "";

        if(breadIndex1 != breadIndex2) {
            filling = str.substring(breadIndex1 + "bread".length(), + breadIndex2);
        } else {
            System.out.println("nothing");
        }
        System.out.println(filling);
    }
}
