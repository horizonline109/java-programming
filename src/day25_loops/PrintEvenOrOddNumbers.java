package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("***** EVEN Numbers 0 - 100 *****");
        for(num  = 2; num<= 100; num++){
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n***** ODD Numbers 0 -100 *****");
        for(int odd = 0; odd <= 100; odd++) {
            if(odd % 2 != 0){
                System.out.print(odd + " ");
            }
        }

    }
}
