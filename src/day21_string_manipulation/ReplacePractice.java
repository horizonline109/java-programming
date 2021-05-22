package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());


        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);
        sentence = sentence.replace("java", "selenium")
                            .replace("fun", "is really fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for Java book";
        result = result.replace("1-48 of over ","")
                .replace(",","")
                .replace("results for Java book", "");
        System.out.println("result = " + result);
    }
}
