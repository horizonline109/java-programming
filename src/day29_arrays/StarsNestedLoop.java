package day29_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            System.out.println();
            for(int j = 1; j <= 10; j++) {
                System.out.print(" * ");
            }
        }

        for(int outer = 1; outer <=5; outer++){
            System.out.println();
            for(int inner = 1; inner <= outer; inner++) {
                System.out.print(" * ");
            }
        }



        for(int outer = 1; outer <=10; outer++){
            System.out.println();
            for(int inner = 10; inner >= outer; inner--) {
                System.out.print(" * ");
            }
        }

    }
}