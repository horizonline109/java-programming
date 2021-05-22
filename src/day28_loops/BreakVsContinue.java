package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        for(int n =1; n <= 5; n++) {
            System.out.print(n);
            //break; --> would only ptint once and exit
            if(n == 4) {
                break;
            }
        }
        for(int i = 1; i <= 5; i++) {
            if(i ==2 || i == 4) {
                continue; //makes the system jump back to the top of the loop again
            }
            System.out.println(i);
        }
    }
}
