package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while (isHungry) {
            System.out.println("You ate" + bananas + " bananas. \uD83C\uDF4C You are still hungry.");
            bananas++;
            if (bananas == countToFull) {
                isHungry = false;
            }

        }
        System.out.println("Congratulations. You ate " + bananas + " bananas.  \uD83C\uDF4C You are full.");
    }
}
