package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        int seconds = 0;

        System.out.println("Starting: World's Smallest Cat : -BBC");

        while (seconds < 117) {
            System.out.println("Watching YouTube video at: " + seconds);
            seconds++;
            Thread.sleep(1000); //pause the code for 1000 milliseconds
        }
        System.out.println("Video finished. Upcoming Video:");


    }
}
