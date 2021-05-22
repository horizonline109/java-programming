package solo_practice;
import java.util.*;

public class ReplitFarthestPlanet {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String farPlanet = "pluto";
            String a = "a";
            String b = "b";
            String c = "c";
            if(a.equals(farPlanet)) {
                System.out.println(a + " is wrong");
            } else if(b.equals(farPlanet)) {
                System.out.println(b + " is correct");
            } else if (b != (farPlanet)) {
                System.out.println(b + " is wrong");
            } else {
                System.out.println(c + " is wrong");
            }  a = s.nextLine();

            //your code here




        }
    }
