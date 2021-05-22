package day29_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int minutes = 1; minutes <= 5; minutes++) {
            System.out.println("\nminutes = " + minutes);
            for (int seconds = 1; seconds <= 60; seconds++) {
                System.out.print(seconds + " ");
            }
        }

        for (int hours = 1; hours < 2; hours++) {
            System.out.println("\nhours = " + hours);
            for (int minutes = 1; minutes < 60; minutes++) {
                System.out.println("\nminutes = " + minutes);
                for (int seconds = 1; seconds < 60; seconds++) {
                    System.out.print(seconds + " ");
                }
            }

        }


// make nested loop that will show minutes, then seconds (ex. 15:43)
        for (int minutes = 0; minutes <= 2; minutes++) {
            for (int second = 0; second < 60; second++) {
                System.out.println(minutes + " : " + second);
            }
        }
    }
}
