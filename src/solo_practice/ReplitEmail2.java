package solo_practice;
import java.util.*;

public class ReplitEmail2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String name = email.toUpperCase().charAt(0) + email.substring(1, email.indexOf("_"));

        int underScore = email.indexOf("_");
        int postAt = email.indexOf("@") + 1;

        int indexOfAt=email.indexOf("@");
        String lastName=email.substring(underScore +1 ,indexOfAt);
        String firstLastName= lastName.substring(0,1).toUpperCase();
        int dot = email.indexOf(".");
        String domain = email.substring(postAt, dot);

        System.out.println("First name: "+ name);
        System.out.println("Last name: "+firstLastName + lastName.substring(1));
        System.out.println("Domain: "+domain);





    }
}
