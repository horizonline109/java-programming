package day29_arrays;

public class NestedTimeLooop {
    public static void main(String[] args) {
        for (int minutes = 1; minutes <= 10; minutes++) {
            for (int seconds = 1; seconds <= 5; seconds++) {
                System.out.println(minutes);
            }
        }

        for (int i = 1; i <= 5; i++) { //outer loop
            for (int j = 1; j <= 5; j++) { //inner loop
                //code
            }
        }
    }
}