package solo_practice;

import java.util.*;
public class ReplitBurgerOrChicken {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String in = s.next();

            //your code here
            String burger, chicken, soda, fries;
            double price = 0;
            if(in.equals("burger") || in.equals("chicken")){
                price = 10;
            } else if (in.equals("soda")){
                price = 2;
        } else if(in.equals("fries")) {
                price = 3.5;
            }



    }
}
