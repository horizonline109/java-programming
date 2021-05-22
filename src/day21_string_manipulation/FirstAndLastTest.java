package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char second = word.charAt(2);
        //char first = 'm'; can do it this way, or the way up above
        //char second = 'm';
        if(first == second){
            System.out.println("Same first and last letter");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() -1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        String friends = "ilhom";




    }
}
