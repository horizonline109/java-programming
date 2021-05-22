package solo_practice;

public class SplitStuff {
    public static void main(String[] args) {
        String word = "java ; is ; fun";
        word.split(" ");

        String words3 = "bengal cat persian cat no cat here";
        words3.split(" cat"); // cuts into index bengal = 0, persian = 1, no = 2, here = 3

    }
}
