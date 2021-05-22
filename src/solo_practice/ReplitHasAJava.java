package solo_practice;
import java.util.*;

public class ReplitHasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if(str.indexOf("java") == 0 || str.indexOf("java") == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
