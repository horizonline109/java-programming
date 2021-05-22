package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int star = 0; star <= 15; star++){
            System.out.print("* ");
        }

        String myStars = "";
        for(int i = 1; i <= 5; i++) {
            System.out.print("\uD83C\uDF1F ");
        }
        System.out.println("my stars = " + myStars.trim());

    }
}
