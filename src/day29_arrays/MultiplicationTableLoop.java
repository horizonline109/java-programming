package day29_arrays;

public class MultiplicationTableLoop {
    public static void main(String[] args) {

    for(int outer = 1; outer <= 10; outer++) {
        System.out.println();
        for(int inner = 1; inner <= 10; inner++) {
            System.out.print(inner * outer + "\t");
        }
    }

    for(int row =1; row <= 3; row++) {
        for(int col = 1; col <=4; col++) {
            System.out.println(row + " | " + col);
        }
    }


}

}