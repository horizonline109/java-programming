package solo_practice;
import java.util.*;

public class GroupInfo {
    public static void main(String[] args) {
        string();
        System.out.println();
        name("Ramin", "is super cool!");
        //System.out.println(sum);
    }

    public static void string(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);

    }

    public static void name(String a, String b){
        String sum = a + b;
        System.out.println(sum);
        //return sum;
    }
    
    //public static List<Integer> teddy(){
       // List<Integer> num = new ArrayList<>(100);
            
       // }
  //  }

}
