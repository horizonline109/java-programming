package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        char first = word.charAt(0);
        char second = word.charAt(1);
        char third = word.charAt(2);
        char fourth = word.charAt(3);
        System.out.println(fourth + "" + third + "" + second + "" + first);

        String word2 ="" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);
        if(word.equalsIgnoreCase(word2)) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }
}
