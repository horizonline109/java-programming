package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.indexOf("g")); // 0
        System.out.println(word.indexOf("hub")); // output = 3 because it only counts the first
        System.out.println(word.indexOf("java")); // output = -1 because it can't find any
    }
}
