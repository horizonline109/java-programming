package solo_practice;

import java.util.*;

public class ReplitPrintMinusLastLetter {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String txt = s.next();
            //your code here
            //char lastLetter = txt.charAt(txt.length() -1);
            System.out.println(txt.substring(txt.length() -1));


        }
    }
