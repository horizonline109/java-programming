package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }

        String word = "Java";
        String uWord = word.toUpperCase();

        System.out.println(word); //Java
        System.out.println(uWord); //JAVA
        if(word.equals(uWord)) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }


        String words = "selenium";
        System.out.println(words.endsWith("m")); //true
    }
}
