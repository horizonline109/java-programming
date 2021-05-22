package day29_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {

    String word1 = "java";
    for(int i = 0; i < word1.length(); i++){
        for(int j = 0; j<= i; j++) {
            System.out.print(word1.charAt(j));
        }
        System.out.println();
    }

    String word = "java";
    for(int i = 0; i < word.length(); i++) {
        for(int j = 0; j <= i; j++) {
            System.out.print(word.charAt(j));
        }
        System.out.println();
    }
    for(int i = 0; i < word.length(); i++) {
        for (int j = i; j < word.length(); j++) {
            System.out.print(word.charAt(j));
        }
        System.out.println();
    }

    }
}
